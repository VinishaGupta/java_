package LinearDataStuctures.linkedList.LinkedList2.Circular;

public class Main4 {
    public static void main(String[] args) {

        CLL4 cll=new CLL4();
        cll.insertFirst(2);
        cll.insertFirst(7);
        cll.insertFirst(4);
        cll.insertFirst(6);
        cll.insertFirst(1);
        cll.display();
        cll.insertLast(5);
        cll.insertLast(3);
        cll.display();

        cll.insert(22,7);
        cll.display();

        cll.insert(55,0);
        cll.display();

        cll.insert(88,3);
        cll.display();

        cll.deleteFirst();
        cll.display();

        cll.deleteLast();
        cll.display();

        cll.delete(0);
        cll.display();

        cll.delete(4);
        cll.display();
    }
}
