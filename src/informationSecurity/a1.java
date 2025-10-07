package informationSecurity;

import java.util.Scanner;

public class a1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = in.nextLine().toUpperCase();

        System.out.print("Enter multiplicative term: ");
        int a = in.nextInt();

        System.out.print("Enter additive term: ");
        int b = in.nextInt();

        int a_inv = -1;
        for (int i = 1; i < 26; i++) {
            if ((a * i) % 26 == 1) {
                a_inv = i;
                break;
            }
        }

        if (a_inv == -1) {
            System.out.println("Invalid key! 'a' must be coprime with 26.");
            return;
        }

        String encrypted = encrypt(str, a, b);
        System.out.println("Encrypted Text: " + encrypted);

        String decrypted = decrypt(encrypted, a, b);
        System.out.println("Decrypted Text: " + decrypted);
    }

    public static String encrypt(String str, int a, int b) {
        String cipher = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isLetter(ch)) {
                int x = ch - 'A';
                char enc = (char) (((a * x + b) % 26) + 'A');
                cipher = cipher + enc;
            } else {
                cipher = cipher + ch;
            }
        }

        return cipher;
    }

    public static String decrypt(String cipher, int a, int b) {
        String msg = "";

        int a_inv = -1;
        for (int i = 1; i < 26; i++) {
            if ((a * i) % 26 == 1) {
                a_inv = i;
                break;
            }
        }

        for (int i = 0; i < cipher.length(); i++) {
            char ch = cipher.charAt(i);

            if (Character.isLetter(ch)) {
                int y = ch - 'A';
                int dec = (a_inv * (y - b + 26)) % 26;
                char decChar = (char) (dec + 'A');
                msg = msg + decChar;
            } else {
                msg = msg + ch;
            }
        }

        return msg;
    }
}
