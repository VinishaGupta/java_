package random;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main3 {
    public static void main(String[] args) {
        Set<Integer> set=new HashSet<>();

        int[] arr={4,5,2,4,2,4,6,4,7,8,6,1};
        for(int n: arr){
            set.add(n);
        }

        System.out.println(set);
//[1, 2, 4, 5, 6, 7, 8]
    }
}
