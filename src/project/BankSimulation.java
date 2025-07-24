package project;

import java.awt.*;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

class Account{
    static int accCounter=1000;
    int accNo;
    String name;
    double balance;


    public Account(String name,double balance){
        accNo=++accCounter;
        this.name=name;
        this.balance=balance;
        System.out.println("Account created with account number: "+accNo);
    }

    public double withdraw(double money){

        balance-=money;
        return balance;
    }

    public double deposit(double money){
        balance+=money;
        return balance;
    }

    public double checkBalance(){
        return balance;
    }

    public void getDetails(){
        System.out.println("Account number: "+accNo);
        System.out.println("Name: "+name);
        System.out.println("Balance: "+balance);
    }


}

public class BankSimulation {
    public static void main(String[] args) {

        Map<Integer,Account> map=new LinkedHashMap<Integer, Account>();


        while (true){

            System.out.println("Enter your operation: ");
            System.out.println("1. Create an account");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Check Balance");
            System.out.println("5. Get account details");
            System.out.println("6. Exit");

            Scanner in=new Scanner(System.in);

            int choice=in.nextInt();

            if(choice==1){
                in.nextLine();
                System.out.print("Enter name: ");
                String name=in.nextLine();
                System.out.print("Enter the amount you want to deposit(minimum-1000): ");
                int a=in.nextInt();
                while(a<1000){
                    System.out.print("Minimum amount to deposit is 1000, please enter the amount again: ");
                    a=in.nextInt();
                }

                Account acc=new Account(name,a);
                map.put(acc.accNo,acc);


            } else if(choice==2){
                System.out.print("Enter your account number: ");
                int accNo=in.nextInt();
                if(map.containsKey(accNo)){
                    System.out.print("Enter the amount you want to withdraw: ");
                    double amt=in.nextDouble();
                    if(map.get(accNo).checkBalance()-amt>0){
                        System.out.println(map.get(accNo).withdraw(amt));
                    } else{
                        System.out.println("Insufficient balance");
                    }
                } else{
                    System.out.println("Account not found");
                }
            } else if(choice==3){
                System.out.print("Enter your account number: ");
                int accno=in.nextInt();
                if(map.containsKey(accno)){
                    System.out.println("Enter thr amount you want to deposit: ");
                    double amt=in.nextDouble();
                    System.out.println(map.get(accno).deposit(amt));
                }
            } else if(choice==4){
                System.out.print("Enter your account number: ");
                int accno=in.nextInt();
                if(map.containsKey(accno)){
                    System.out.println(map.get(accno).checkBalance());
                }
            } else if(choice==5){
                System.out.print("Enter your account number: ");
                int accno=in.nextInt();
                if(map.containsKey(accno)){
                    map.get(accno).getDetails();
                }
            }else{
                System.out.println("Exited successfully");
                break;
            }
        }
    }
}
