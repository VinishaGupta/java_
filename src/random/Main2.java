package random;

import java.util.ArrayList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        List list=new ArrayList<>();
        list.add(6);

        int[] arr={5,3,2,1};

        for( int n : arr){
            list.add(n);
        }

        System.out.println(list);

        for(int n: arr){
            list.add(n);
        }

        System.out.println(list);

        list.set(0,77);
        System.out.println(list);

        System.out.println(list.indexOf(2));
    }
}
