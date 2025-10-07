package Training.Array;

import java.util.Arrays;

public class Main7 {
    public static void main(String[] args) {
        int[] arr={2,7,9,11,23};
        int target=20;
        System.out.println(Arrays.toString(twoSum(arr,target)));
    }

    public static int[] twoSum(int[] arr,int target){

        int l=0;
        int r=arr.length-1;


        while(l<r){
            int sum=arr[l]+arr[r];
            if(sum==target) {
                return new int[]{l, r};
            } else if(sum>target){
               r--;
            } else {
                l++;
            }
        }


        return new int[]{-1,-1};
    }


}
