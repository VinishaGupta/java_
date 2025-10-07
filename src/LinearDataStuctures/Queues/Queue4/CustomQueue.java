package LinearDataStuctures.Queues.Queue4;

public class CustomQueue {
    protected int[] data;
    private static final int DS=5;

    public CustomQueue(){
        this(DS);
    }

    public CustomQueue(int size){
        this.data=new int[size];
    }

    private int front=0;
    private int rear=0;
    private int size=0;

    public boolean isFull(){
        return rear==data.length-1;
    }

    public boolean isEmpty(){
        return front>=rear;
    }

    public void enqueue(int item){
        if(isFull()){
            System.out.println("queue is full");
        } else {
            data[rear++]=item;
            size++;
        }
    }

    public int dequeue(){
        if(isEmpty()){
            System.out.println("queue is empty");
            return -1;
        } else{
            size--;
            return data[front++];
        }
    }

    public void display(){
        System.out.print("front -> ");
        for (int i = front; i < rear; i++) {
            System.out.print(data[i]+" -> ");
        }
        System.out.print("rear");
        System.out.println("Size: "+size);
    }


}
