package Trees.BST;

public class BST1 {
    private static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data=data;
        }
    }

    private Node root;

    public void insert(int value){
        if(root==null){
            root=new Node(value);
        } else{
            if(value<root.data){

            }
        }
    }
}
