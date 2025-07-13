package sorting;

import java.util.Arrays;

public class All {
    public static void main(String[] args) {
        int[] arr={4,1,5,2,3};
//        cyclic(arr);
        int[] ans=mergeSort(arr);
//      System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(ans));


    }

    public static void bubble(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length-i; j++) {
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }

            }

        }
    }

    public static void selection(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int lastIndex= arr.length-i-1;
            int maxElementIndex=findMaxElementIndex(arr,lastIndex);
            swap(arr,lastIndex,maxElementIndex);
        }
    }

    public static int findMaxElementIndex(int[] arr,int lastIndex){
        int max=0;
        for (int i = 0; i <=lastIndex; i++) {
            if(arr[i]>arr[max]){
                max=i;
            }
        }
        return max;
    }

    public static void swap(int[] arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }

    public static void insertion(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j >0; j--) {
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }
            }
        }
    }

    public static void cyclic(int[] arr){
        int i=0;

        while (i<arr.length){
            int corr=arr[i]-1;

            if(arr[i]!=arr[corr]){
                swap(arr,i,corr);
            } else{
                i++;
            }
        }
    }

    public static int[] mergeSort(int[] arr){
        if (arr.length==1){
            return arr;
        }

        int mid= arr.length/2;

        int[] left=mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right=mergeSort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(left,right);
        
    }

    public static int[] merge(int[] first,int[] second){

        int[] mix=new int[first.length+second.length];
        int i=0,j=0,k=0;

        while(i<first.length && j<second.length){
            if(first[i]<second[j]){
                mix[k]=first[i];
                i++;
            } else {
                mix[k]=second[j];
                j++;
            }
            k++;
        }

        while (i<first.length){
            mix[k]=first[i];
            i++;
            k++;
        }

        while (j<second.length){
            mix[k]=second[j];
            k++;
            j++;
        }

        return mix;

    }


}
