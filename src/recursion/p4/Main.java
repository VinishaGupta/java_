//package recursion.p4;
//
//public class Main {
//    public static void main(String[] args) {
//
//        String str="bccad";
//        String s="";
//        System.out.println(fun1(str,s,0));
//        System.out.println(fun2(str,0));
//        String s1="";
//        skip(s1,str);
//        System.out.println(skip("adgdgaejapa"));
//
//    }
//
//    public static String fun1(String str,String s,int i){
//        if(i==str.length()){
//            return s;
//        }
//
//        if(str.charAt(i)!='a'){
//            s+=str.charAt(i);
//        }
//
//        return fun1(str,s,i+1);
//    }
//
//    public static String fun2(String str,int i){
//        if(i==str.length()){
//            return " ";
//        }
//
//        if(str.charAt(i)!='a'){
//            return str.charAt(i)+fun2(str,i+1);
//        } else{
//            return fun2(str,i+1);
//        }
//
//    }
//
//    public static void skip(String p,String up){
//        if(up.isEmpty()){
//            System.out.println(p);
//            return;
//        }
//
//        char ch=up.charAt(0);
//
//        if(ch=='a'){
//            skip(p,up.substring(1));
//        } else{
//            skip(p+ch,up.substring(1));
//        }
//    }
//
//    public static String skip(String str){
//        if(str.isEmpty()){
//            return "";
//        }
//
//        char ch=str.charAt(0);
//
//        if(ch!='a'){
//            return ch+skip(str.substring(1));
//        } else{
//            return skip(str.substring(1));
//        }
//    }
//
//
