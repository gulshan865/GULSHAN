package collection_list;

import java.util.ArrayList;
import java.util.List;

public class List_prctice1 {
    public void list() {
        List student = new ArrayList();

        student.add("ram");
        student.add("jerry");
        student.add("logan");
        student.add("adom");
        student.add("thor");
        student.add("howk eye");
        student.add("balck panther");
        student.add("doctor strange");
        student.add("winter solder");

        for (Object var : student) {
            System.out.println(var);
        }

    }
    public static void main(String[] args) {
        List_prctice1 avengers = new List_prctice1();
        avengers.list();


    }
    }

