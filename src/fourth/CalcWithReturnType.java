package fourth;

public class CalcWithReturnType {
    public int add(int a, int b){

        int result=a+b;

        return result;
    }
    public int multiplication(int x, int y) {

        int result = x * y;

        return result;
    }
    public int subtraction(int c, int d) {

        int result = c - d;

        return result;
    }
    public int division(int p, int q) {

        int result = p / q;

        return result;
    }

    public static void main(String[] args) {
        CalcWithReturnType obj=new CalcWithReturnType();


        int result=obj.add(10,14);
        System.out.println(result);

        int result1=obj.multiplication(15,22);
        System.out.println(result1);

        int result2=obj.subtraction(9456,2565);
        System.out.println(result2);

        int result3=obj.division(98,3);
        System.out.println(result3);
    }
}
