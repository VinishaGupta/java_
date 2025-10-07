//package LinearDataStuctures.linkedList.LinkedList2.Circular;
//
//public class CLL3 {
//    private class Node{
//        int data;
//        Node next;
//
//        public Node(int data){
//            this.data=data;
//        }
//    }
//
//    private Node head;
//    private Node tail;
//    private int size=0;
//
//    public int getHeadValue(){
//        return head==null? -1:head.data;
//    }
//
//    public int getTailValue(){
//        return tail==null?-1:tail.data;
//    }
//
//    public int getSize(){
//        return size;
//    }
//
//    public void insertFirst(int data){
//        Node node=new Node(data);
//        if(head==null){
//            head=node;
//            tail=node;
//            node.next=head;
//        } else{
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
//                System.out.print(temp.data+" -> ");
//                temp=temp.next;
//            } while(temp!=head);
//        }
//
//        System.out.println("head");
//        System.out.println("Head: "+getHeadValue());
//        System.out.println("Tail: "+getTailValue());
//        System.out.println("Size: "+getSize());
//    }
//
//    public void insertLast(int data){
//        Node node=new Node(data);
//
//        if(head==null){
//            head=node;
//            tail=node;
//            tail.next=head;
//        } else{
//            tail.next=node;
//            tail=node;
//            tail.next=head;
//        }
//    }
//
//}
