package patterns2.TwoPointers.OppositePointers;

// 2 sum
//sorted array

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 2, 4, 6, 10};
        int target=8;
        System.out.println(Arrays.toString(fun(nums,target)));
    }


    public static int[] fun(int[] arr,int target){
        int i=0;
        int j=arr.length-1;

        while (i<j){
            int sum=arr[i]+arr[j];

            if(sum==target){
                return new int[]{arr[i],arr[j]};
            } else if(sum>target){
                j--;
            } else{
                i++;
            }

        }

        return new int[]{-1,-1};
    }

}
