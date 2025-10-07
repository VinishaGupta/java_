//package LinearDataStuctures.Stacks.Stack5;
//
//public class CustomStack {
//    protected int[] data;
//    private static final int DS=10;
//
//    public CustomStack(){
//        this(DS);
//    }
//
//    public CustomStack(int size){
//        this.data=new int[size];
//    }
//
//    protected int ptr=-1;
//    protected int size=0;
//
//    public boolean isEmpty(){
//        return ptr==-1;
//    }
//
//    public boolean isFull(){
//        return ptr==data.length-1;
//    }
//
//    public boolean push(int item) throws Exception{
//        if(isFull()){
//            throw new Exception("stack is full, cannot push into full stack");
//        } else{
//            data[++ptr]=item;
//            return true;
//        }
//    }
//
//    public
//}
