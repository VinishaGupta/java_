package LinearDataStuctures.linkedList.LinkedList2.Singly;

public class Main {
    public static void main(String[] args) {
        SLL ll=new SLL();
        ll.insertFirst(3);
        ll.insertFirst(5);
        ll.insertFirst(6);
        ll.insertFirst(1);
        ll.display();
        System.out.println(ll.getHeadValue());
        System.out.println(ll.getTailValue());
        System.out.println(ll.getSize());

        ll.insertAtEndByHead(22);
        ll.insertAtEndByHead(80);

        ll.display();
        System.out.println(ll.getHeadValue());
        System.out.println(ll.getTailValue());
        System.out.println(ll.getSize());

//        SLL ll2=new SLL();
//        System.out.println(ll2.getHeadValue());
//        System.out.println(ll2.getTailValue());
    }
}
