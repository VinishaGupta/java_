package recursion.p3;

//bubble sort

import java.util.Arrays;

public class Main3 {
    public static void main(String[] args) {

        int[] arr={4,3,5,1,2};
        int[] arr1={4,3,5,1,2};

        bubble(arr);
        System.out.println(Arrays.toString(arr));

        bubble1(arr1,0,0);
        System.out.println(Arrays.toString(arr1));


    }

    public static void bubble(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

    public static void bubble1(int[] arr,int i,int j){
        if(i==arr.length-1){
            return;
        }

        if(j== arr.length-i-1){
            bubble1(arr,i+1,0);
            return;
        }

        if(arr[j]>arr[j+1]){
            int temp=arr[j];
            arr[j]=arr[j+1];
            arr[j+1]=temp;
        }

        bubble1(arr,i,j+1);

    }
}
