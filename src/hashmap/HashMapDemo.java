package hashmap;

import java.util.HashMap;

public class HashMapDemo {

    public void demo(){

        HashMap<Integer,String> demo = new HashMap<>();

        demo.put(1,"gangadher ny pagal banaya sabko");
        demo.put(2,"jija ji ka hotal hy **** dygy ");
        demo.put(3,"y babu rao ka style hy");

        System.out.println(demo.get(1));
        System.out.println(demo.get(2));
        System.out.println(demo.get(3));

        HashMap<String,String> demo1 = new HashMap<>();

        demo1.put("A","agra");
        demo1.put("B","delhi");
        demo1.put("c","pune");

        System.out.println(demo1.get("A"));
        System.out.println(demo1.get("B"));
        System.out.println(demo1.get("C"));
    }

    public static void main(String[] args) {
        HashMapDemo obj = new HashMapDemo();
        obj.demo();
    }
}
