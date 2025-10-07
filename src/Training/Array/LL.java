package Training.Array;

public class LL {

    private class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
        }
    }

    Node head=null;
    Node tail=null;

    int size=0;

    public  void insertLast(int data){
        Node node=new Node(data);
        if(head==null){
            insertFirst(data);
        } else {
            tail.next=
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
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        while(temp!=null){
            System.out.print(temp.data+" -> ");

            temp=temp.next;
        }
        System.out.print("null");
        System.out.println();
    }



    public int middle(){

        if(head==null){
            return -1;
        }

        Node slow=head;
        Node fast=head;

        while (fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        return slow.data;

    }


}
