//package random;
//
//import javax.smartcardio.ATR;
//import java.util.*;
//
//public class Main6 {
//    public static void main(String[] args){
//        Map<Integer,Integer> map=new LinkedHashMap<>();
//
//        int[] arr={3,2,6,4,7,3,6,4,5,3,21,5,7,4,4};
//
//        for(int i:arr){
//            if( map.containsKey(i)){
//                map.put(i,map.get(i)+1);
//            }
//            else{
//                map.put(i,1);
//            }
//        }
//
//        System.out.println(map);
//
//        ArrayList<Integer> a=new ArrayList<>();
//        for(int i:arr){
//            a.add(i);
//        }
//
//        System.out.println(Collections.frequency(a,21));
//        System.out.println((a));
//
//        int max=0;
//
//        for(int i:a){
//            if( Collections.frequency(a,i)>max){
//                max=Collections.frequency(a,i);
//            }
//        }
//
//        System.out.println(max);
//    }
//}
