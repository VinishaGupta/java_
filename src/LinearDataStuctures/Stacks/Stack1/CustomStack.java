//package LinearDataStuctures.Stacks.Stack1;
//
//public class CustomStack {
//    protected  int[] data;
//    private  static final int defaultSize=10;
//
//    int ptr=-1;
//
//    public CustomStack(){
//        this(defaultSize);
//    }
//
//    public CustomStack(int size){
//        this.data=new int[size];
//    }
//
//    public boolean push(int item){
//
//        if(isFull()){
//            System.out.println("stack is full");
//            return false;
//        }
//        else {
//            ptr++;
//            data[ptr]=item;
//            return true;
//        }
//    }
//
//    public boolean isFull(){
//        return ptr==data.length-1;
//    }
//
//    public boolean isEmpty(){
//        return ptr==-1;
//    }
//
//    public int pop() throws StackException {
//        if(isEmpty()){
////            System.out.println("stack is empty");
////            return false;
//
//            throw new StackException("stack is full");
//        } else{
//            int val=data[ptr];
//            data[ptr]=0;
//            ptr--;
//            return val;
//        }
//    }
//
////    public int peek() throws StackException{
////        if(isEmpty()){
////            throw new StackException("cannot peek from empty stack");
////        } else{
////            return data[ptr];
////        }
////    }
//
//    public int peek() throws StackException{
//        if(isEmpty()){
//            throw new StackException("cannot peek from empty stack");
//        } else{
//            return data[ptr];
//        }
//    }
//}
