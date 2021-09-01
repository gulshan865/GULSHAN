package collection_list;

import model.Student;

import java.util.ArrayList;

public class StudentListDemo {
    public void demo(){

        ArrayList <Student> studentarraylist= new ArrayList<>();

        Student student1 = new Student("java",25,"IT");
        studentarraylist.add(student1);

        Student student2 = new Student("simran",24,"CS");
        studentarraylist.add(student2);

        Student student3 = new Student("manoj",25,"EE");
        studentarraylist.add(student3);

        for (Student var : studentarraylist){
            System.out.println(var.getName());
            System.out.println(var.getSection());
            System.out.println(var.getAge());
        }


    }

    public static void main(String[] args) {
        StudentListDemo obj = new StudentListDemo();
        obj.demo();

    }
}
