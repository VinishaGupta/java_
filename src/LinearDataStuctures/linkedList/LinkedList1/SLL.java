package LinearDataStuctures.linkedList.LinkedList1;

public class SLL {

    private Node head;
    private Node tail;

    private  int size=0;

    public SLL(){
        this.size=size;
    }

    private class Node{

        private int data;
        private Node next;

        public Node(int data){
            this.data=data;
        }

        public Node(int data,Node next){
            this.data=data;
            this.next=next;
        }

    }

    public void insertFirst(int data){
        Node node=new Node(data);

        if(head==null){
            head=node;
        }
        

    }

}
