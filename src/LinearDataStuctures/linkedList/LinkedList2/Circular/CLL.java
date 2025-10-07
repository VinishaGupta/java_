//package LinearDataStuctures.linkedList.LinkedList2.Circular;
//
//public class CLL {
//    private class Node{
//        int data;
//        Node next;
//
//        public Node(int data){
//            this.data=data;
//        }
//
//    }
//
//    private Node head;
//    private Node tail;
//    private int size;
//
//    public CLL(){
//        this.size=0;
//    }
//
//    public int getHead(){
//        return head.data;
//    }
//
//    public int getTail(){
//        return tail.data;
//    }
//
//    public void insertFirst(int data){
//        Node node=new Node(data);
//        if(head==null){
//            head=node;
//            tail=node;
//            node.next=head;
//        } else {
//            node.next=head;
//            head=node;
//            tail.next=head;
//        }
//        size++;
//    }
//
//    public void display(){
//        if(head==null){
//            System.out.println("list is empty");
//        } else{
//            Node temp=head;
//            do{
//                System.out.print(temp.data +" -> ");
//                temp=temp.next;
//            } while (temp!=head);
//        }
//        System.out.println("head");
//        System.out.println("Head: "+getHead());
//        System.out.println("Tail: "+getTail());
//    }
//
//    public void insertLast(int data){
//        Node node=new Node(data);
//        if(head==null){
//            head=node;
//            tail=node;
//            node.next=head;
//        } else {
//            node.next=head;
//            tail.next=node;
//            tail=node;
//        }
//        size++;
//    }
//}
