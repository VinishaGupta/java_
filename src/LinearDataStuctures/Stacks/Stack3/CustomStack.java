package LinearDataStuctures.Stacks.Stack3;

public class CustomStack {
    protected int[] data;
    private static final int defaultSize=10;

    public CustomStack(int size){
        this.data=new int[size];
    }

    public CustomStack(){
        this(defaultSize);
    }

    int ptr=-1;

    public boolean isEmpty(){
        return ptr==-1;
    }

    public boolean isFull(){
        return ptr==data.length-1;
    }

    public int push(int item) throws StackException{
        if(isFull()){
            throw new StackException("cannot push into full stack");
        } else {
            ptr++;
            data[ptr]=item;
            return item;
        }
    }

    public int pop() throws StackException{
        if(isEmpty()){
            throw new StackException("cannot pop from empty stack");
        } else {
            return data[ptr--];
        }
    }

    public int peek() throws StackException{
        if(isEmpty()){
            throw new StackException("Cannot pop from empty stack");
        } else {
            return data[ptr];
        }
    }

    public void print(){
        for (int i = ptr; i >-1; i--) {
            System.out.println("| "+data[i]+" |");
            System.out.println("-----");
        }
    }
}
