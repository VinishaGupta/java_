package project.a;

import java.util.HashMap;
import java.util.Scanner;

class Student{
    static int idCounter=100;
    int id;
    String name;
    int age;
    String dept;

    public Student(String name, int age,String dept) {
        this.id=++idCounter;
        this.name = name;
        this.dept = dept;
        this.age = age;
    }

    public Student(int id,String name, int age, String dept) {
        this.id=id;
        this.name = name;
        this.dept = dept;
        this.age = age;
    }

//    @Override
//    public String toString(){
//        return "Id: "+id+", Name: "+name+ ", Age: "+age+" ,Dept: "+dept;
//    }

    @Override
    public String toString(){
        return "Id: "+id+", Name: "+name+ ", Age: "+age+" ,Dept: "+dept;
    }

}
public class StudentRecords {
    static HashMap<Integer,Student> map=new HashMap<>();
    static Scanner in=new Scanner(System.in);

    public static void main(String[] args) {



        while (true){
            System.out.println("Enter operation: \n1.Add \n2.View one \n3.View All \n4.Delete \n5.Exit ");
            int choice=in.nextInt();
            if(choice==1){
                add();
            } else if(choice==2){
//                viewOne();
            } else if(choice==3){
                view();
            } else if(choice==4){
//                delete();
            } else if(choice==5){
                break;
            } else {
                System.out.println("Invalid choice");
            }
        }



    }

    public static void add(){
        System.out.println("Enter id, name,age,dept");
        int id=in.nextInt();
        in.nextLine();
        String name=in.nextLine();
        int age=in.nextInt();
        in.nextLine();
        String dept=in.nextLine();

        if(map.containsKey(id)){
            System.out.println("id already exists");
        } else{
            Student stu=new Student(id,name,age,dept);
            map.put(id,stu);
            System.out.println("added");
        }

    }


    public static void view(){
        map.forEach((integer, student) ->{
            System.out.println(student.toString());
        });
    }

}
