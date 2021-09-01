package hashmap;

import model.Student;

import java.util.HashMap;

public class StudentHashMap {

    public void demo(){

        HashMap<Integer,Student> bacchy = new HashMap();

        Student toodler1 = new Student("chinu",10,"a");
        Student toodler2 = new Student("loku",2,"b");
        Student toodler3 = new Student("hannu",6,"c");
        Student toodler4 = new Student("krush",5,"d");

        bacchy.put(1,toodler1);
        bacchy.put(2,toodler2);
        bacchy.put(3,toodler3);
        bacchy.put(4,toodler4);

        Student toodler = bacchy.get(1);
        System.out.println(toodler.getName());
        System.out.println(toodler.getAge());
        System.out.println(toodler.getSection());

         toodler = bacchy.get(2);
        System.out.println(toodler.getName());
        System.out.println(toodler.getAge());
        System.out.println(toodler.getSection());

         toodler = bacchy.get(3);
        System.out.println(toodler.getName());
        System.out.println(toodler.getAge());
        System.out.println(toodler.getSection());

         toodler = bacchy.get(4);
        System.out.println(toodler.getName());
        System.out.println(toodler.getAge());
        System.out.println(toodler.getSection());

    }

    public static void main(String[] args) {
        StudentHashMap obj = new StudentHashMap();
        obj.demo();
    }
}
