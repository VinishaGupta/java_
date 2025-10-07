//package LinearDataStuctures.Stacks.Stack2;
//
////import LinearDataStuctures.Stacks.Stack1.StackException;
//
//import java.util.Arrays;
//
//public class CustomStack {
//    protected int[] data;
//    private static int defaultSize=10;
//
//    public CustomStack(int size){
//        this.data=new int[size];
//    }
//
//    public CustomStack(){
//        this(defaultSize);
//    }
//
//    int ptr=-1;
//
//    public boolean isFull(){
//        return ptr==data.length-1;
//    }
//
//    public boolean isEmpty(){
//        return ptr==-1;
//    }
//
//    public int push(int item)  throws StackException {
//        if(isFull()){
//            throw new StackException("stack is full,cannot add item into full stack");
//        } else{
//            ptr++;
//            data[ptr]=item;
//            return item;
//        }
//    }
//
//    public int pop() throws StackException{
//        if(isEmpty()){
//            throw new StackException("stack is empty,cannot delete from empty stack");
//        } else{
//           return data[ptr--];
//        }
//    }
//
//    public int peek() throws StackException{
//        if(isEmpty()){
//            throw new StackException("stack is empty,cannot delete from empty stack");
//        } else{
//            return data[ptr];
//        }
//    }
//
//    public void print(){
//        System.out.println(Arrays.toString(data));
//    }
//}
