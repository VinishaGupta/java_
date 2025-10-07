package LinearDataStuctures.linkedList.LinkedList2.Circular;

public class CLL4 {
    private class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public void insertFirst(int data){
        Node node=new Node(data);

        if(head==null){
            head=node;
            tail=node;
            tail.next=head;
        } else {
            node.next=head;
            head=node;
            tail.next=head;
        }

        size++;
    }

    public void display(){
        if(head==null){
            System.out.println("list is empty");
        } else{
            Node temp=head;

            do{
                System.out.print(temp.data+" -> ");
                temp=temp.next;
            } while (temp!=head);

            System.out.println("head");
            System.out.println("Head: "+head.data);
            System.out.println("Tail: "+tail.data);
            System.out.println("Size: "+size);
        }

    }

    public void insertLast(int data){
        if(head==null){
            insertFirst(data);
        } else{
            Node node=new Node(data);
            tail.next=node;
            tail=node;
            tail.next=head;
            size++;
        }
    }

    public void insert(int data,int index){
        if(index==0 || head==null){
            insertFirst(data);
        } else if(index==size){
            insertLast(data);
        } else if(index>size){
            System.out.println("out of bounds. list size: "+size);
        } else{
            Node temp=head;
            for (int i = 0; i < index-1; i++) {
                temp=temp.next;
            }

            Node node=new Node(data);
            node.next=temp.next;
            temp.next=node;
            size++;
        }
    }

    public void deleteFirst(){
        if(head==null){
            System.out.println("list is empty");
        } else if(head==tail){
            head=null;
            tail=null;
            size--;
        } else{
            head=head.next;
            tail.next=head;
            size--;
        }
    }

    public void deleteLast(){
        if(head==null){
            System.out.println("list is empty");
        } else if(head==tail){
            head=null;
            tail=null;
            size--;
        } else{
            Node temp=head;
            while (temp.next!=tail){
                temp=temp.next;
            }

            tail=temp;
            tail.next=head;
            size--;
        }
    }

    public void delete(int index){
        if(head==null){
            System.out.println("list is empty");
        } else if(index==0){
            deleteFirst();
        } else if (index==size-1) {
            deleteLast();
        } else if(index>=size){
            System.out.println("out of bounds, list size: "+size);
        } else{
            Node temp=head;
            for (int i = 0; i < index-1; i++) {
                temp=temp.next;
            }

            temp.next=temp.next.next;
            size--;
        }
    }
}
