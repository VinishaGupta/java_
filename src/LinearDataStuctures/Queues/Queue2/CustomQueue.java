package LinearDataStuctures.Queues.Queue2;

public class CustomQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE=5;

    public CustomQueue(int size){
        this.data=new int[size];
    }

    public CustomQueue(){
        this(DEFAULT_SIZE);
    }

    private int front=0;
    private int rear=-1;
    int size=0;

    public boolean isEmpty(){
        return front>rear;
    }

    public boolean isFull(){
        return rear==data.length-1;
    }

    public boolean enqueue(int item){
        if(isFull()){
            System.out.println("queue is full");
            return false;
        } else{
            data[++rear]=item;
            return true;
        }
    }

    public int dequeue(){
        if(isEmpty()){
            return -1;
        } else{
            return data[front++];
        }
    }

    public void display(){
        if(isEmpty()){
            System.out.println("queue is empty");
        } else{
            for (int i = front; i <= rear; i++) {
                System.out.print(data[i]+" -> ");
            }
            System.out.println("rear");

            System.out.println("Empty: "+isEmpty());
            System.out.println("Full: "+isFull());
            System.out.println("Front: "+data[front]);
            System.out.println("Rear: "+data[rear]);
        }
    }
}
