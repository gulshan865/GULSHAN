package fourth;

import com.sun.org.apache.xpath.internal.objects.XString;

public class MethodWithReturnType {
    public String demo(){
        String name="saitama";
        return name;
    }
    public int roll(){
        int num=10;
        return num;
    }

    public static void main(String[] args) {
        MethodWithReturnType naam = new MethodWithReturnType();
                String var=naam.demo();
                System.out.println(var);


                int var1=naam.roll();
                System.out.println(var1);
    }
}
