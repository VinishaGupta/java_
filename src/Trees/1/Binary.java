//package Trees;
//
//import java.util.Scanner;
//
//public class Binary {
//
//    private static class Node{
//        int data;
//        Node left;
//        Node right;
//
//        public Node(int data){
//            this.data=data;
//        }
//
//    }
//
//    private Node root;
//
//    public void insert(Scanner in){
//        System.out.print("Enter root: ");
//        int value=in.nextInt();
//        root=new Node(value);
//        insert(in,root);
//    }
//
//    public void insert(Scanner in,Node node){
//        System.out.print("Do you want to enter left of "+ node.data+"?: ");
//        boolean left=in.nextBoolean();
//
//        if(left){
//            System.out.print("Enter the left of "+node.data+": ");
//            int value=in.nextInt();
//            node.left=new Node(value);
//            insert(in,node.left);
//        }
//
//        System.out.print("Do you want to enter right of "+ node.data+"?: ");
//        boolean right=in.nextBoolean();
//
//        if(right){
//            System.out.print("Enter the right of "+node.data+": ");
//            int value=in.nextInt();
//            node.right=new Node(value);
//            insert(in,node.right);
//        }
//    }
//
////    public void display(){
////        display(root,"");
////    }
////
////    public void display(Node node,String indent){
////        if(node==null){
////            return;
////        }
////
////        if(node.)
////    }
//
//    public void diplayPreorder(){
//        System.out.print("Preorder: ");
//        preorder(root);
//        System.out.println();
//    }
//
//    public void preorder(Node node){
//        if(node!=null){
//            System.out.print(node.data+" ");
//            preorder(node.left);
//            preorder(node.right);
//        }
//    }
//}
