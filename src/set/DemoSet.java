package set;

import java.util.HashSet;

public class DemoSet {

    public void demo(){

        HashSet<String> StringHashSet = new HashSet<>();

        StringHashSet.add("baly baly");
        StringHashSet.add("shava shava");
        StringHashSet.add("gangnam stayle ");
        StringHashSet.add("in the end");
        StringHashSet.add("see you again");
        StringHashSet.add("worth it");
        StringHashSet.add("lovely");
        StringHashSet.add("tu aa ky dekh ly");
        StringHashSet.add("baly baly");
        StringHashSet.add("i am the one");

        for (String song: StringHashSet){
            System.out.println(song);
        }
    }

    public static void main(String[] args){
        DemoSet songs =new DemoSet();
        songs.demo();
    }
}
