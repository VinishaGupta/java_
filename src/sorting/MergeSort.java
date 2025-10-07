//package sorting;
//
//import java.util.Arrays;
//
//public class MergeSort {
//    public static void main(String[] args) {
//        int[] arr={4,2,3,5,1};
//        int[] ans=mergeSort(arr);
//        System.out.println(Arrays.toString(ans));
//    }
//
//    public static int[] mergeSort(int[] arr){
//        if (arr.length==1){
//            return arr;
//        }
//
//        int mid=arr.length/2;
//
//        int[] left=mergeSort(Arrays.copyOfRange(arr,0,mid));
//        int[] right=mergeSort(Arrays.copyOfRange(arr,mid,arr.length));
//
//        return merge(left,right);
//    }
//
//    public static int[] merge(int[] first,int[] second){
//        int[] mix=new int[first.length+second.length];
//
//        int i=0,j=0,k=0;
//
//        while (i<first.length && j<second.length){
//            if(first[i]<second[j]){
//                mix[k]=first[i];
//                i++;
//            } else{
//                mix[k]=second[j];
//                j++;
//            }
//            k++;
//        }
//
//        while (i<first.length){
//            mix[k]=first[i];
//            i++;
//            k++;
//        }
//
//        while ((j<second.length)){
//            mix[k]=second[j];
//            j++;
//            k++;
//        }
//
//        return mix;
//    }
//
//
//    public static void mergeSortInPlace(int[] arr,int s,int e){
//        if (arr.length==1){
//            return;
//        }
//
//        int mid=(s+e)/2;
//
//        mergeSortInPlace(arr,0,mid);
//        mergeSortInPlace(arr,mid,e);
//
//        mergeInPlace(arr,s,mid,e);
//    }
//
//    public static void mergeInPlace(int[] arr,int s,int m,int e) {
//        int[] mix=new int[e-s];
//
//        int i=s;
//        int j=m;
//        int k=0;
//
//        while (i<first.length && j<second.length){
//            if(first[i]<second[j]){
//                mix[k]=first[i];
//                i++;
//            } else{
//                mix[k]=second[j];
//                j++;
//            }
//            k++;
//        }
//
//        while (i<first.length){
//            mix[k]=first[i];
//            i++;
//            k++;
//        }
//
//        while ((j<second.length)){
//            mix[k]=second[j];
//            j++;
//            k++;
//        }
//
//
//
//
//    }
//
//}
//
