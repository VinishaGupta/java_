package recursion.p3;

public class Main1 {
    public static void main(String[] args) {
        print(1,1,4);
        print1(4,4);
    }

    public static void print(int i,int j,int n){
        if(i>n){
            return;
        }

        if(j>n){
            System.out.println();
            print(i+1,1,n);
            return;
        }

        System.out.print('*');
        print(i,j+1,n);
    }

    public static void print1(int i,int j){
        if(i==0){
            return;
        }

        if(j==0){
            System.out.println();
            print1(i-1,1);
            return;
        }

        System.out.print('*');
        print1(i,j-1);
    }
}
