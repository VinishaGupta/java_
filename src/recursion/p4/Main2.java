package recursion.p4;

public class Main2 {
    public static void main(String[] args) {
//        skip a string

        String str="aappbcaapplesnvjfappleapp";
        System.out.println(skipApple(str));
        System.out.println(skipAppButNotApple(str));
    }

    private static String skipAppButNotApple(String str) {
        if(str.isEmpty()){
            return "";
        }

        if(str.startsWith("app") && !str.startsWith("apple")){
            return skipAppButNotApple(str.substring(3));
        } else{
            return str.charAt(0)+skipAppButNotApple(str.substring(1));
        }
    }

    private static String skipApple(String str) {
        if(str.isEmpty()){
            return "";
        }

        if(str.startsWith("apple")){
            return skipApple(str.substring(5));
        } else{
            return str.charAt(0)+skipApple(str.substring(1));
        }
    }
}
