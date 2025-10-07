package recursion.p3;

public class Main {
    public static void main(String[] args) {

        int n=4;
        int i=1;
        print(i,n-i+1);
    }

    public static void print(int i,int j){
        if(i>4){
            return;
        }

        System.out.print('*');

        if(j<1){
            print(i,j+1);
        }

        print(i+1,1);
    }
}
