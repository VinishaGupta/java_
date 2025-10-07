package Training.Array;

import java.util.HashMap;
import java.util.Map;

public class Main9 {
    public static void main(String[] args) {
        Map<Integer,Integer> map=new HashMap<>();
        int[] arr={3,1,3,5,5,2,5,1,6,8};

        for(int n:arr){
            if(map.containsKey(n)){
                map.put(n,map.get(n)+1);
            } else{
                map.put(n,1);
            }
        }

        System.out.println(map);
    }
}
