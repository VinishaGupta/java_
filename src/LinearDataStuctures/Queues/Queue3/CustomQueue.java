package LinearDataStuctures.Queues.Queue3;

public class CustomQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE=5;

    public CustomQueue(int size){
        this.data=new int[size];
    }

    public CustomQueue(){
        this(DEFAULT_SIZE);
    }

    int front=0;
    int rear=0;

    int size=0;

    public boolean isEmpty(){
        return front>=rear;
    }

    public boolean isFull(){
        return data.length-1==rear;
    }

    public void enqueue(int item) throws Exception{
        if(isFull()){
            throw new Exception("Stack is full");
        } else{
            data[rear++]=item;
        }

    }

    public int dequeue() throws Exception{
        if(isEmpty()){
            throw new Exception("Stack is empty");
        } else {
            int a=data[front];

            for (int i = 1; i <=rear; i++) {
                data[i-1]= data[i];
            }

            return a;
        }




    }

    public void display() {
        if (isEmpty()) {
            System.out.println("queue is empty");
        } else {
            for (int i = front; i <= rear; i++) {
                System.out.print(data[i] + " -> ");
            }
            System.out.println("rear");

            System.out.println("Empty: " + isEmpty());
            System.out.println("Full: " + isFull());
            System.out.println("Front: " + data[front]);
            System.out.println("Rear: " + data[rear]);
        }


    }
}
