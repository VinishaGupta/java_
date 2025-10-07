package recursion.p1;

//binary search

public class Main4 {
    public static void main(String[] args) {

        int[] arr={2,5,9,11,15};
        int target=15;
        int index=binarySearch(arr,target,0,arr.length-1);
        System.out.println(index);
    }

    public static int binarySearch(int[] arr,int target,int start,int end){

        if(start>end){
            return -1;
        }

        int mid=(start+end)/2;

        if(arr[mid]==target){
            return mid;
        }

        if(arr[mid]>target){
            return binarySearch(arr,target,start,mid-1);
        }
        else{
            return binarySearch(arr,target,mid+1,end);
        }
    }
}
