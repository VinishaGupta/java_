package LinearDataStuctures.linkedList.LinkedList2.Doubly;

public class DLL {
    private class Node{
        Node prev;
        int data;
        Node next;

        public Node(int data){
            this.data=data;
        }

        public Node(Node prev,int data,Node next){
            this.prev=prev;
            this.data=data;
            this.next=next;
        }

    }

    private Node head;
    private Node tail;

    private int size;

    public DLL(){
        this.size=0;
    }

    public void insertFirst(int data){
        Node node=new Node(data);

        if(head==null){
            head=node;
            tail=node;
        } else{
            node.next=head;
            head.prev=node;
            head=node;
        }
        size++;

    }

    public int getHead(){
        return head.data;
    }

    public int getTail(){
        return tail.data;
    }

    public void display(){
        if(head==null){
            System.out.println("no nodes");
        } else{
            System.out.println("=================================");
            Node temp=head;
            while (temp!=null){
                System.out.print(temp.data+" -> ");
                temp=temp.next;
            }
            System.out.println("null");
            System.out.println(getHead());
            System.out.println(getTail());
            System.out.println(size);
            System.out.println("=================================");
        }
    }

    public void displayReverseUsingHead(){
        Node temp=head;

        while(temp.next!=null){
            temp=temp.next;
        }

        while (temp!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.prev;
        }
        System.out.println("null");
    }

    public void displayReverseUsingTail(){
        Node temp=tail;

        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.prev;
        }
        System.out.println("null");
    }

    public void insertAtLastUsingHead(int data){
        if(head==null) {
            insertFirst(data);
        } else{
            Node node=new Node(data);
            Node temp=head;

            while(temp.next!=null){
                temp=temp.next;
            }

            node.prev=temp;
            temp.next=node;
            tail=node;
            size++;
        }
    }

    public void insertAtLastUsingTail(int data){
        if(head==null){
            insertFirst(data);
        } else{
            Node node=new Node(data);

            node.prev=tail;
            tail.next=node;
            tail=node;
            size++;
        }
    }

    public void insert(int data,int index){
        if(index>size){
            System.out.println("out of bounds");

        } else if(head==null || index==0){
            insertFirst(data);
        }  else if(index==size){
            insertAtLastUsingHead(data);
        } else {
            Node node=new Node(data);
            Node temp=head;

            for (int i = 0; i < index-1; i++) {
                temp=temp.next;
            }

            node.next=temp.next;
            node.next.prev=node;
            node.prev=temp;
            temp.next=node;
            size++;
        }
    }

    public void deleteFirst(){
        if(head==null){
            System.out.println("list is empty");
        } else if(head.next==null){
            head=null;
            tail=null;
            size--;
        }
        else {
            head=head.next;
            head.prev=null;
            size--;
        }
    }

    public void deleteLastUsingHead(){
        if(head==null){
            System.out.println("list is empty");
        } else if(head.next==null){
            head=null;
            tail=null;
            size--;
        } else{
            Node temp=head;
            while (temp.next.next!=null){
                temp=temp.next;
            }

            temp.next=null;
            tail=temp;
            size--;
        }
    }

    public void deleteLastUsingTail(){
        if(head==null){
            System.out.println("list is empty");
        } else if(head.next==null){
            head=null;
            tail=null;
            size--;
        } else {
            tail=tail.prev;
            tail.next=null;
            size--;
        }
    }

    public void delete(int index){
        if(head==null){
            System.out.println("list is empty");
        } else if(index>=size){
            System.out.println("out of bounds");
        } else if(index==0){
            deleteFirst();
        } else if(index==size-1){
            deleteLastUsingHead();
        } else {
            Node temp=head;
            for (int i = 0; i < index-1; i++) {
                temp=temp.next;
            }
            temp.next=temp.next.next;
            temp.next.prev=temp;
            size--;
        }
    }
}
