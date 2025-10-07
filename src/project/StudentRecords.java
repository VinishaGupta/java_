package project;

import java.util.HashMap;
import java.util.Scanner;
import java.util.SortedMap;

class Student{
    static int idCounter=100;

    int id;
    String name;
    int age;
    String dept;

    public Student(int id,String name,int age,String dept){
        this.id=id;
        this.name=name;
        this.age=age;
        this.dept=dept;
    }

    public Student(String name,int age,String dept){
        id=++idCounter;
        this.name=name;
        this.age=age;
        this.dept=dept;
    }

    @Override
    public String toString(){
        return "Name: "+name+", Age: "+age+", Dept: "+dept;
    }
}

public class StudentRecords {
    static HashMap<Integer,Student> map=new HashMap<>();
    static Scanner in=new Scanner(System.in);

    public static void main(String[] args) {


        while(true){
            System.out.println("Enter operation: ");
            System.out.println("1. Add a new student");
            System.out.println("2. View a student");
            System.out.println("3. View all students");
            System.out.println("4. Delete a student");
            System.out.println("5. Exit");

            int choice=in.nextInt();

            if (choice==1) {
                add();
            } else if(choice==2) {
                System.out.print("Enter student id: ");
                int id = in.nextInt();
                System.out.println(map.get(id));
            } else if(choice==3) {
                map.forEach((id, student) -> {
                    System.out.println("Id: "+id+" -> "+ student.toString());
                });
            } else if(choice==4) {
                System.out.println("Enter is to delete: ");
                int id = in.nextInt();
                if (map.containsKey(id)) {
                    map.remove(id);
                    System.out.println("deleted");
                } else {
                    System.out.println("not exists");
                }
            } else if (choice==5) {
                System.out.println("program exited");
                break;
            } else {
                System.out.println("invalid choice");
            }

        }
    }

    public static void add(){
        System.out.print("Enter name: ");
        in.nextLine();
        String name=in.nextLine();
        System.out.print("Enter age: ");
        int age=in.nextInt();
        System.out.print("Enter dept: ");
        in.nextLine();
        String dept=in.nextLine();

        Student student=new Student(name,age,dept);
        map.put(student.id,student);
        System.out.println("Student added");
    }
}
