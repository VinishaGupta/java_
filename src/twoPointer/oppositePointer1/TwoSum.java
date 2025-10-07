package twoPointer.oppositePointer1;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args){
        int[] arr={2,7,11,15};
        int target=17;
        int[] ans=fun1(arr,target);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] fun1(int[] arr,int target){
        int left=0;
        int right=arr.length-1;

        while(left<right){
            int sum=arr[left]+arr[right];
            if(sum==target){
                return new int[]{arr[left],arr[right]};
            } else if (sum<target) {
                left++;
            }
            else{
                right--;
            }
        }

        return new int[]{-1,-1};
    }
}
