package LinearDataStuctures.linkedList.LinkedList2.Singly;

public class Main2 {
    public static void main(String[] args) {

        SLL2 ll=new SLL2();
        ll.insertAtBeginning(3);
        ll.insertAtBeginning(1);
        ll.insertAtBeginning(2);
        ll.insertAtBeginning(6);
        ll.display();

        ll.insertAtEndByHead(5);
        ll.insertAtEndByHead(9);
        ll.insertAtEndByHead(7);
        ll.display();

        ll.insertAtEndByTail(11);
        ll.insertAtEndByTail(44);
        ll.display();

        ll.insert(54,0);
        ll.insert(101,ll.getSize());
//        ll.insert(23,ll.getSize()+5);
        ll.insert(65,4);
        ll.display();

        SLL2 ll2=new SLL2();
        ll2.insertAtBeginning(3);
        ll2.insertAtBeginning(5);
        ll2.insertAtBeginning(1);
        ll2.insertAtBeginning(9);
        ll2.display();

//        ll2.deleteFirst();
//        ll2.deleteFirst();
        ll2.deleteFirst();
        ll2.deleteAtEndByHead();
        ll2.display();

        ll2.insertAtBeginning(55);
        ll2.insertAtBeginning(23);
        ll2.display();

        ll2.delete(2);
        ll2.display();

        System.out.println(ll2.search(55));

        ll2.reverse();
        ll2.display();

        System.out.println(ll2.getMiddleElement());

        ll2.insertAtBeginning(4);
        ll2.display();
        System.out.println(ll2.getMiddleElement());

    }


}

