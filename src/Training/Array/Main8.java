//package Training.Array;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//class Solution {
//    List<List<Integer>> ans =new ArrayList<>();
//    public List<List<Integer>> threeSum(int[] nums) {
//        int n =nums.length;
//        if(n<3) return ans;
//        Arrays.sort(nums);
//        for(int i=0;i<n;i++){
//            if(nums[i]==nums[i-1]) continue;
//            twosums(i,nums,n);
//        }
//        return ans;
//    }
//
//    public static int[] twoSum(int[] arr,int target){
//
//        int l=0;
//        int r=arr.length-1;
//
//
//        while(l<r){
//            int sum=arr[l]+arr[r];
//            if(sum==target) {
//                return new int[]{l, r};
//            } else if(sum>target){
//                r--;
//            } else {
//                l++;
//            }
//        }
//
//
//        return new int[]{-1,-1};
//    }
//
