package project;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        System.out.println(fun());
    }

    public static String fun(){
        Scanner in=new Scanner(System.in);
        int value=generateRandom();
        while(true){
            System.out.print("Enter a number: ");
            int num=in.nextInt();
            if(value==num){
                return "You guessed it right";
            } else if (Math.abs(num-value)<=10){
                System.out.println("Hot");
            } else{
                System.out.println("Cold");
            }
        }
    }

    public static int generateRandom(){
        Random r=new Random();
        return r.nextInt(1,101);
    }
}
