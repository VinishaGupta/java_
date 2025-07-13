package sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={4,3,1,5,2};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void selection(int[] arr){
        for(int i=0;i< arr.length;i++){
            int lastIndex=arr.length-i-1;
            int maxIndex=findMaxIndex(arr,lastIndex);
            swap(arr,lastIndex,maxIndex);
        }
    }

    public static int findMaxIndex(int[] arr,int last){
        int maxIndex=0;
        for (int i = 1; i < last; i++) {
            if(arr[maxIndex]<arr[i]){
                maxIndex=i;
            }
        }
        return maxIndex;
    }

    public static void swap(int[] arr,int last,int max){
        int temp=arr[last];
        arr[last]=arr[max];
        arr[max]=temp;
    }
}
