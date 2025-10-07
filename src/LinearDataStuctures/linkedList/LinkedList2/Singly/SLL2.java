package LinearDataStuctures.linkedList.LinkedList2.Singly;

public class SLL2 {
    private class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
        }

        public Node(int data,Node next){
            this.data=data;
            this.next=next;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public SLL2(){
        this.size=0;
    }

    public void insertAtBeginning(int data){
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
        System.out.println("========================================");
        if(head==null){
            System.out.println("list is empty");
        }
        else{
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" -> ");
                temp=temp.next;
            }
            System.out.print("null");
        }
        System.out.println();
        System.out.println(getHeadValue());
        System.out.println(getTailValue());
        System.out.println(getSize());
        System.out.println("========================================");
    }

    public int getHeadValue(){
        System.out.print("Head: ");
        return head==null?-1:head.data;
    }

    public int getTailValue(){
        System.out.print("Tail: ");
        return tail==null?-1:tail.data;
    }

    public int getSize(){
        System.out.print("Size: ");
        return size;
    }

    public void insertAtEndByHead(int data){
        if(head==null){
            insertAtBeginning(data);
        } else{
            Node node=new Node(data);
            Node temp=head;

            while (temp.next!=null){
                temp=temp.next;
            }

            temp.next=node;
            tail=node;
            size++;
        }
    }

    public void insertAtEndByTail(int data){
        if(head==null){
            insertAtBeginning(data);
        } else {
            Node node=new Node(data);
            tail.next=node;
            tail=node;
            size++;
        }
    }

    public void insert(int data,int index){
        if(index>size){
            System.out.println("out of bounds");
        } else if(index==0){
            insertAtBeginning(data);
        } else if(index==size){
            insertAtEndByTail(data);
        } else {
            Node temp=head;

            for (int i = 0; i < index-1; i++) {
                temp=temp.next;
            }

            Node node=new Node(data,temp.next);
            temp.next=node;
            size++;
        }
    }


    public void deleteFirst(){
        if(head==null){
            System.out.println("nothing to delete");
        } else if (head.next==null) {
            head=null;
            tail=null;
            size--;
        } else{
            head=head.next;
            size--;
        }
    }


    public void deleteAtEndByHead(){
        if(head==null){
            System.out.println("nothing to delete");
        } else if(head.next==null){
            head=null;
            tail=null;
            size--;
        } else{
            Node temp=head;

            while(temp.next.next!=null){
                temp=temp.next;
            }

            temp.next=null;
            tail=temp;
            size--;
        }
    }

    public void delete(int index){
        if(index==0){
            deleteFirst();
        } else if (index==size-1) {
            deleteAtEndByHead();
        } else if (index>=size) {
            System.out.println("out of bounds");
        } else{
            Node temp=head;
            for (int i = 0; i < index-1; i++) {
                temp=temp.next;
            }
            temp.next=temp.next.next;
            size--;
        }
    }

    public int search(int value){
        Node temp=head;
        int count=0;
        while (temp!=null){

            if(temp.data==value){
                return count;
            }

            temp=temp.next;
            count+=1;
        }

        return -1;
    }

    public void reverse(){
        Node prev=null;
        Node curr=head;
        Node nxt=null;

        tail=head;

        while(curr!=null){
            nxt=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nxt;
        }

        head=prev;
    }

    public int getMiddleElement(){
        if(size==0){
            return -1;
        } else if(size==1){
            return head.data;
        } else{
            Node slow=head;
            Node fast=head;

            while (fast.next!=null && fast.next.next!=null){
                slow=slow.next;
                fast=fast.next.next;
            }

            return slow.data;
        }
    }

    public boolean isThereALoop(){
        if(size<2){
            return false;
        } else{
            Node slow=head;
            Node fast=head;

            while(fast!=null && fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;

                if(fast==slow){
                    return true;
                }
            }

            return false;
        }
    }

}
