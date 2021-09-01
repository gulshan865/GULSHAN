package set;

import model.Student;

import java.util.HashSet;

public class SetWithStudent {

    public void demo(){

        HashSet<Student> sixth = new HashSet<Student>();

        Student student1 = new Student("aditya pratap singh",12,"A");
        Student student2 = new Student("tanisha kumari",12,"A");
        Student student3 = new Student("purvi singh",10,"B");
        Student student4 = new Student("ansh kumar",11,"B");
        Student student5 = new Student("anmol kumar",10,"C");

        sixth.add(student1);
        sixth.add(student2);
        sixth.add(student3);
        sixth.add(student4);
        sixth.add(student5);

        for (Student school : sixth){
            System.out.println(school.getName());
            System.out.println(school.getSection());
            System.out.println(school.getAge());
        }
    }

    public static void main(String[] args) {
        SetWithStudent obj = new SetWithStudent();
        obj.demo();
    }
}
