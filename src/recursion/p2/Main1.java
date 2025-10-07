package recursion.p2;

import java.util.ArrayList;

public class Main1 {
    public static void main(String[] args) {
        int[] arr={2,4,8,1,8};

//        System.out.println(search(arr,8));
//        System.out.println(search(arr,9));
//        System.out.println(search1(arr,8,0));
//        System.out.println(search1(arr,9,0));

//        System.out.println(search2(arr,8));
//        System.out.println(search2(arr,9));

        ArrayList<Integer> list=new ArrayList<>();

        System.out.println(check3(arr,8,list,0));
        System.out.println(check4(arr,8,0));
    }

    public static int search(int[] arr,int target){

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==target){
                return i;
            }
        }

        return -1;
    }

    public static int search1(int[] arr,int target,int i){

        if(arr.length==i){
            return -1;
        }

        if(arr[i]==target){
            return i;
        }

        return search1(arr,target,i+1);
    }

    public static ArrayList<Integer> search2(int[] arr,int target){

        ArrayList<Integer> list=new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==target){
                list.add(i);
            }
        }

        return list;
    }

    public static ArrayList<Integer> check3(int[] arr,int target,ArrayList<Integer> list,int i){
        if(i==arr.length){
            return list;
        }

        if(arr[i]==target){
            list.add(i);
        }

        return check3(arr,target,list,i+1);
    }

    public static ArrayList<Integer> check4(int[] arr,int target,int i){
        ArrayList<Integer> list=new ArrayList<>();

        if(i==arr.length){
            return list;
        }

        if(arr[i]==target){
            list.add(i);
        }

        ArrayList<Integer> list1=check4(arr,target,i+1);
        list.addAll(list1);
        return list;
    }
}
