package collection_list;

import java.util.ArrayList;
import java.util.List;

public class DemoList {

    public void demo(){

        List demolist = new ArrayList();

        demolist.add("one");
        demolist.add("two");
        demolist.add("three");
        demolist.add("four");

        System.out.println(demolist.get(3));

        for (Object var : demolist){
            System.out.println(var);
        }
        System.out.println(demolist.get(2));

        demolist.remove(0);
        for (Object var : demolist){
            System.out.println(var);
        }
        System.out.println(demolist.get(1));

    }

    public static void main(String[] args) {
        DemoList num = new DemoList();
        num.demo();
    }
}
