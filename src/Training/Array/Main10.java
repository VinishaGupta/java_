package Training.Array;


public class Main10 {
    public static void main(String[] args) {
        LL list=new LL();
        list.insertFirst(2);
        list.insertFirst(6);
        list.insertFirst(1);
        list.insertFirst(9);
        list.insertFirst(8);
        list.display();

        System.out.println(list.middle());
    }


}
