package LinearDataStuctures.linkedList.LinkedList2.Doubly;

public class Main {
    public static void main(String[] args) {

        DLL dll=new DLL();
        dll.insertFirst(4);
        dll.insertFirst(5);
        dll.insertFirst(1);
        dll.insertFirst(9);
        dll.display();
        dll.displayReverseUsingHead();
        dll.displayReverseUsingTail();
        dll.insert(3,6);
        dll.display();
        dll.insert(2,2);
        dll.display();
    }
}
