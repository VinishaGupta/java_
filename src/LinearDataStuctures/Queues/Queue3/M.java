package LinearDataStuctures.Queues.Queue3;

public class M {
    public static void main(String[] args) throws Exception{
        CustomQueue queue=new CustomQueue(4);

        queue.display();
        queue.enqueue(3);
        queue.enqueue(2);
        queue.enqueue(1);
//        queue.enqueue(6);
//        queue.enqueue(8);
        queue.display();
//        queue.enqueue(3);
    }
}
