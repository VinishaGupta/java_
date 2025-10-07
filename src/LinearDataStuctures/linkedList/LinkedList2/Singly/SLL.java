package LinearDataStuctures.linkedList.LinkedList2.Singly;

public class SLL {
    private Node head;
    private Node tail;

    private int size=0;



    private class Node{
        private int data;
        private Node next;

        Node(int data,Node next){
            this.data =data;
            this.next=next;
        }

        Node(int data){
            this.data =data;
        }
    }

    public void insertFirst(int data){
        Node node=new Node(data);

        if(head==null){
            head=node;
            tail=node;
        } else{
            node.next=head;
            head=node;
        }
        size++;
    }

    public void display(){
        Node temp=head;

        System.out.println("========================================");
        while (temp!=null){
            System.out.print(temp.data +" -> ");
            temp=temp.next;
        }
        System.out.print("null");
        System.out.println();
        System.out.println("========================================");

//        System.out.println();
    }

    public int getHeadValue(){
        return head == null ?-1:head.data;
    }
    public int getTailValue(){
        return tail==null?-1:tail.data;
    }

    public int getSize(){
        return size;
    }

    public void insertAtEndByHead(int data){

        if(head==null){
            insertFirst(data);
        } else{
            Node node=new Node(data);
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }

            temp.next=node;
            tail=node;
            size++;
        }



    }

    public void insertByTail(int data){
        if (head==null){

        }
    }


}
