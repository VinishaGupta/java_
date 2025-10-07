package LinearDataStuctures.Stacks.Stack3;

public class Main {
    public static void main(String[] args) throws StackException{
        CustomStack stack=new CustomStack(4);
        stack.push(3);
        stack.push(6);
        stack.push(1);
        stack.push(8);
        stack.print();

    }
}
