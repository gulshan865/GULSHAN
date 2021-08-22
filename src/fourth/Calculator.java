package fourth;

public class Calculator {

    public void add(){
        int x = 10;
        int y = 15;
        int result = x+y;

        System.out.println(result);
    }
    public void subtract(){
        int x = 10;
        int y = 15;
        int result = x-y;
        System.out.println(result);
    }
    public void multiplication(){
        int x = 10;
        int y = 15;
        int result = x*y;
        System.out.println(result);
    }
    public void division(){
        int x = 30;
        int y = 15;
        int result = x/y;
        System.out.println(result);
    }

    public static void main(String[] args) {
        Calculator z = new Calculator();
        z.add();
        z.subtract();
        z.multiplication();
        z.division();
    }
}
