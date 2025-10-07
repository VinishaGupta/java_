package LinearDataStuctures.Queues.Queue2;

public class Main {
    public static void main(String[] args) {

        CustomQueue queue=new CustomQueue(4);
        queue.display();
        queue.enqueue(3);
//        queue.display();
        queue.enqueue(4);
        queue.enqueue(9);
        queue.enqueue(8);

        queue.display();

        queue.enqueue(4);

        System.out.println(queue.dequeue());
        queue.display();


    }
}
