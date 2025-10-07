package informationSecurity;

import java.util.Scanner;

public class cipher {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        System.out.println("Encrypt(E) or Decrypt(D): ");
        char a=in.next().charAt(0);
        if(a=='e' || a=='E'){
            System.out.print("Enter text: ");
            String s=in.next();
            System.out.print("Enter key: ");
            int key=in.nextInt();
            System.out.println(encrpt(s,key));
        } else if(a=='d' || a=='D') {
            System.out.print("Enter cipher text: ");
            String s = in.next();
            System.out.print("Enter key: ");
            int key = in.nextInt();
            System.out.println(decrpt(s,key));
        } else{
            System.out.println("Invalid operation");
        }

//        String str="hello";
//        String s = encrpt("HELLO", 3);
//        System.out.println(s);
//
//        String s1 = decrpt(s, 3);
//        System.out.println(s1);
//
//        System.out.println(encrpt("ABC", 3));
//        System.out.println(decrpt("ABC", 3));
//        System.out.println(encrpt("abc", 3));
//        System.out.println(decrpt("def", 3));
//
//        System.out.println(encrpt("xyz",3));
//        System.out.println(decrpt(encrpt("xyz",3),3));
    }

    public static String encrpt(String str, int s) {
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                char ch = (char) (((int) str.charAt(i) + s - 65) % 26 + 65);
                sb.append(ch);
            } else {
                char ch = (char) (((int) str.charAt(i) + s - 97) % 26 + 97); //
                sb.append(ch);
            }
        }

        return sb.toString();
    }

    public static String decrpt(String str, int s) {
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                char ch = (char) (((int) str.charAt(i) - s - 65 + 26) % 26 + 65);
                sb.append(ch);
            } else {
                char ch = (char) (((int) str.charAt(i) - s - 97 + 26) % 26 + 97);
                sb.append(ch);
            }
        }

        return sb.toString();
    }
}
