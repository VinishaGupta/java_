package Training;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class b {
    public static void main(String[] args) {
        int[] arr={1,3,2,1,4,6,4,1,2,4,1};
        ArrayList<Integer> list=new ArrayList<>();
        int k=3;

        Set<Integer> set=new HashSet<>();

        for (int i = 0; i < k; i++) {
            set.add(arr[i]);
        }

        list.add(set.size());

        for (int i = k; i < arr.length; i++) {
            set.remove(arr[i-1]);
            set.add(arr[i]);
        }
    }


}
