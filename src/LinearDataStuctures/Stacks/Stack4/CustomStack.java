package LinearDataStuctures.Stacks.Stack4;

public class CustomStack {
    protected int[] data;
    private static final int DS=10;

    public CustomStack(){
        this(DS);
    }

    public CustomStack(int size){
        this.data=new int[size];
    }

    int ptr=-1;
    private int size=0;

    public boolean isEmpty(){
        return ptr==-1;
    }

    public boolean isFull(){
        return ptr==data.length-1;
    }

    public boolean push(int item){
        if(isFull()){
            System.out.println("Stack is full");
            return false;
        } else{
            data[++ptr]=item;
            size++;
            return true;
        }
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("stack is empty");
            return -1;
        } else{
            size--;
            return data[ptr--];
        }
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("stack is empty");
            return -1;
        } else {
            return data[ptr];
        }
    }

    public void display(){
        for (int i = 0; i <=ptr; i++) {
            System.out.println(data[i]);
        }
    }
}
