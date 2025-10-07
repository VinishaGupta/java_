package patterns2.TwoPointers1;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr={1,2,4,6,10};
        int target=8;

        int[] ans=fun(arr,target);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] fun(int[] arr,int target){
        int i=0;
        int j=arr.length-1;

        while(i<j){
            int sum=arr[i]+arr[j];

            if(sum==target){
                return new int[]{i,j};
            } else if(sum<target){
                i++;
            } else {
                j--;
            }
        }

        return new int[]{-1,-1};
    }
}
