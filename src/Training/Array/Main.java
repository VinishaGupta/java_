package Training.Array;

public class Main {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

        int i=0;
        while(i<arr.length){
            System.out.print(arr[i]+" ");
            i++;
        }

        int j=0;
        do{
            System.out.print(arr[j]+" ");
            j++;
        } while (j<arr.length-1);
    }
}
