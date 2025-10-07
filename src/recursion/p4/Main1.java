package recursion.p4;

public class Main1 {
    public static void main(String[] args) {
        String str="abcabbcdda";
        String s="";
        System.out.println(skip1(str,s,0));
        System.out.println(skip2(str,0));
        String s2="";
        skip3(str,s2);
        System.out.println(skip4(str));
    }

    private static String skip4(String str) {
        if(str.isEmpty()){
            return "";
        }

        char ch=str.charAt(0);

        if(ch=='a'){
            return skip4(str.substring(1));
        } else{
            return ch+skip4(str.substring(1));
        }
    }

    private static void skip3(String str, String s2) {
        if(str.isEmpty()){
            System.out.println(s2);
            return;
        }

        if(str.charAt(0)!='a'){
            skip3(str.substring(1),s2+str.charAt(0));
        } else{
            skip3(str.substring(1),s2);
        }
    }

    private static String skip2(String str, int i) {
        if(i==str.length()){
            return "";
        }

        if(str.charAt(i)!='a'){
           return str.charAt(i)+skip2(str,i+1);
        } else{
            return skip2(str,i+1);
        }
    }

    private static String skip1(String str, String s,int i) {
        if(i==str.length()){
            return s;
        }

        if(str.charAt(i)!='a'){
            s+=str.charAt(i);
            return skip1(str,s,i+1);
        } else{
            return skip1(str,s,i+1);
        }

    }

}
