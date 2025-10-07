package recursion.p2;

public class Main {
    public static void main(String[] args) {
        int[] arr1={2,3,7,9,11};
        int[] arr2={1,5,3,8,4};

//        System.out.println(check(arr1));
//        System.out.println(check(arr2));
//        System.out.println(check3(arr1,0));
//        System.out.println(check3(arr2,0));
//        System.out.println(check4(arr1));
//        System.out.println(check4(arr2));

        System.out.println(check5(arr1,0));
        System.out.println(check5(arr2,0));
    }
    
    public static boolean check(int[] arr){
        boolean a=false;

        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]>arr[i+1]){
                return false;
            }
        }

        return true;
    }

    public static boolean check3(int[] arr,int i){
        if(i<arr.length-1){
            if(arr[i]>arr[i+1]){
                return false;
            }
            return check3(arr,++i);
        }

        return true;
    }

    public static boolean check4(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }

    public static boolean check5(int[] arr,int i){
        if(arr.length-1==i){
            return true;
        }

        if(arr[i]>arr[i+1]){
            return false;
        }

        return check5(arr,i+1);
    }
}
