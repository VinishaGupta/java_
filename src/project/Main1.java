//package project;
//
//import java.util.HashMap;
//import java.util.Scanner;
//
//public class Main1 {
//
//    public static void main(String[] args) {
//
//        HashMap<Integer, Student> map=new HashMap<>();
//         Scanner in=new Scanner(System.in);
//
//        while(true){
//            System.out.println("1. Add a student");
//            System.out.println("2. View Students");
//            System.out.println("3. View a single student");
//            System.out.println("4. Delete a student");
//            System.out.println("5. Exit");
//
//            int choice=in.nextInt();
//
//            switch (choice){
//                case 1->{
//                    add(map,in);
//                } case 2->
//                if (map.isEmpty()) {
//                    System.out.println("No students found.");
//                } else {
//                    map.forEach((id, student) ->
//                            System.out.println("ID: " + id + " → " + student)
//                    );
//                }
//
//            }
//        }
//
//    }
//
//    public static void add(HashMap map,Scanner in){
//        System.out.print("Enter name: ");
//        in.nextLine();
//        String name=in.nextLine();
//        System.out.print("Enter age: ");
//        int age=in.nextInt();
//        System.out.print("Enter dept: ");
//        in.nextLine();
//        String dept=in.nextLine();
//
//        Student stu=new Student(name,age,dept);
//
//        map.put(stu.ID,stu);
//    }
//}
