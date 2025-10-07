package recursion.p3;

public class Main2 {
    public static void main(String[] args) {
        print(4,1);
    }

    public static void print(int i,int j){
        if(i==0){
            return;
        }

        if(j>i){
            System.out.println();
            print(i-1,1);
            return;
        }

        System.out.print('*');
        print(i,j+1);
    }
}
