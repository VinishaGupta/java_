package informationSecurity;

import java.util.Scanner;

public class multiplicative {

    static int a = 7;

    static String encryptMessage(char[] msg) {
        String cipher = "";
        for (int i = 0; i < msg.length; i++) {
            if (msg[i] != ' ') {
                cipher += (char)((((a * (msg[i] - 'A')) % 26) + 'A'));
            } else {
                cipher += msg[i];
            }
        }
        return cipher;
    }

    static String decryptMessage(String cipher) {
        String msg = "";
        int a_inv = 0;

        // Find modular inverse of a under mod 26
        for (int i = 0; i < 26; i++) {
            if ((a * i) % 26 == 1) {
                a_inv = i;
                break;
            }
        }



        for (int i = 0; i < cipher.length(); i++) {
            if (cipher.charAt(i) != ' ') {
                msg += (char)(((a_inv * (cipher.charAt(i) - 'A')) % 26 + 26) % 26 + 'A');
            } else {
                msg += cipher.charAt(i);
            }
        }

        return msg;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Press 1 for encryption\nPress 2 for decryption ");
        System.out.print("Enter choice: ");
        int c=in.nextInt();
        in.nextLine();


        if(c==1){
            System.out.print("Enter a string: ");
            String a=in.nextLine();
            System.out.println(encryptMessage(a.toCharArray()));
        } else if (c==2) {
            System.out.print("Enter a string: ");
            String a=in.nextLine();
            System.out.println(decryptMessage(a));
        } else{
            System.out.println("Invalid choice");
        }
    }
}
