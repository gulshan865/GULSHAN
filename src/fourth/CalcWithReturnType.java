package fourth;

public class CalcWithReturnType {
    public int add(int a, int b){

        int result=a+b;

        return result;
    }

    public static void main(String[] args) {
        CalcWithReturnType obj=new CalcWithReturnType();
        int result=obj.add(10,14);
        System.out.println(result);
    }
}
