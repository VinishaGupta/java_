package recursion.p3;

//Selection Sort

import java.util.Arrays;

public class Main4 {
    public static void main(String[] args) {
        int[] arr={4,3,5,1,2};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void selection(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int lastIndex= arr.length-i-1;
            int maxIndex=findMaxIndex(arr,lastIndex);

            int temp=arr[lastIndex];
            arr[lastIndex]=arr[maxIndex];
            arr[maxIndex]=temp;
        }
    }

    public static int findMaxIndex(int[] arr,int a){
        int max=0;
        for (int i = 0; i <= a; i++) {
            if(arr[max]<arr[i]){
                max=i;
            }
        }

        return max;
    }
}
