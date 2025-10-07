package informationSecurity;

import java.util.Scanner;

public class affileCipher {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str=in.nextLine();
        System.out.print("Enter multiplicative term: ");
        int a=in.nextInt();
        System.out.print("Enter additive term: ");
        int b=in.nextInt();

        System.out.println(encrypt(str,a,b));

    }

    public static String encrypt(String str,int a,int b){
        String cipher="";

        for (int i = 0; i < str.length(); i++) {
            cipher+=(char)((((a*(str.charAt(i))-'A')+b)%26)+'A');
        }

        return cipher;
    }


}


//package project;
//
//import java.util.Scanner;
//
//public class AffineCipher {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//
//        System.out.print("Enter a string (uppercase only): ");
//        String str = in.nextLine().toUpperCase();  // Convert to uppercase
//
//        System.out.print("Enter multiplicative term (a): ");
//        int a = in.nextInt();
//
//        System.out.print("Enter additive term (b): ");
//        int b = in.nextInt();
//
//        if (gcd(a, 26) != 1) {
//            System.out.println("Invalid key! 'a' must be coprime with 26.");
//            return;
//        }
//
//        String encrypted = encrypt(str, a, b);
//        System.out.println("Encrypted Text: " + encrypted);
//    }
//
//    public static String encrypt(String str, int a, int b) {
//        StringBuilder cipher = new StringBuilder();
//
//        for (int i = 0; i < str.length(); i++) {
//            char ch = str.charAt(i);
//
//            if (Character.isLetter(ch)) {
//                // Apply Affine Cipher: E(x) = (a*x + b) mod 26
//                int x = ch - 'A';
//                char enc = (char)(((a * x + b) % 26) + 'A');
//                cipher.append(enc);
//            } else {
//                // Non-alphabetic characters are unchanged
//                cipher.append(ch);
//            }
//        }
//
//        return cipher.toString();
//    }
//
//    // Function to compute GCD
//    public static int gcd(int a, int b) {
//        return b == 0 ? a : gcd(b, a % b);
//    }
//}

