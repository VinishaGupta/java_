package twoPointer.slowAndFast;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {

        int[] arr={1,2,2,2,3,4,4,5,5,6};
        remove(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void remove(int[] arr){
        int slow=0;

        for(int fast=1;fast<arr.length;fast++){
            if(arr[slow]!=arr[fast]){
                slow++;
                arr[slow]=arr[fast];
            }
        }
        for (int i = slow+1; i <arr.length; i++) {
            arr[i]= -1;
        }
    }
}
