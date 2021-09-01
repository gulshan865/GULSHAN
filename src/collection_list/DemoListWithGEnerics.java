package collection_list;

import arrys.ArrayDemo;

import java.util.ArrayList;

public class DemoListWithGEnerics {

    public void demo(){

        ArrayList<String> listname = new ArrayList<>();

        listname.add("one");
        listname.add("two");
        listname.add("three");
        listname.add("four");
        listname.add("five");
        listname.add("seven");
        listname.add("eight");

        for (String var : listname){
            System.out.println(var);
        }

        ArrayList <Integer> integerArrayDemo = new ArrayList<>();

        integerArrayDemo.add(1);
        integerArrayDemo.add(2);
        integerArrayDemo.add(3);
        integerArrayDemo.add(4);
        integerArrayDemo.add(5);
        integerArrayDemo.add(6);
        integerArrayDemo.add(7);

        for (Integer var1:integerArrayDemo){
            System.out.println(var1);
        }

    }

    public static void main(String[] args) {
        DemoListWithGEnerics obj = new DemoListWithGEnerics();
        obj.demo();
    }
}
