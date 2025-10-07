package recursion.p1;

public class Main13 {
    public static void main(String[] args) {
        String str="abc";
//        System.out.println(rev(str));
        String s="";
        System.out.println(rev1(str,s,str.length()-1));
//        System.out.println(rev2(str,str.length()-1));
    }

    public static String rev(String str){

        String s="";

        for (int i = str.length()-1; i >=0; i--) {
            s=s+str.charAt(i);
        }
        return s;
    }

    public static String rev1(String os,String s,int i){
        if(i<0){
            return s;
        }

        s=s+os.charAt(i);
        return rev1(os,s,--i);
    }

    public static String rev2(String str,int i){
        if(i<0){
            return "";
        }

        return str.charAt(i)+rev2(str,--i);

    }

    public static boolean check(String os,String rs){
        if(os.equals(rs)){
            return true;
        }

        return false;
    }
}
