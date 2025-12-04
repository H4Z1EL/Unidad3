public class BinarySearchTree {
    node root; //Raiz del arbol
    public void insert(int value){
        root = insertRec(root, value);
    }
    private node insertRec(node current, int value){
        //caso base cuando current sea null en este punto vamos a crear el nodo
        if(current == null){
            return new node(value);
        }
        if(value < current.value){
            current.left = insertRec(current.left, value);
        } else if(value > current.value){
            current.right = insertRec(current.right, value);
        }
        return current;
    }
    public void printInOrder(){
        System.err.println("---Print in order:---");
        printInOrderRec(root);
    }
    private void printInOrderRec(node current){
        if(current != null){
            printInOrderRec(current.left);
            System.out.println(current.value);
            printInOrderRec(current.right);
        }
    }
}