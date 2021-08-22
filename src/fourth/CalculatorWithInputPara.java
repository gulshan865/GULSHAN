package fourth;

public class CalculatorWithInputPara {

    public void addition(int a , double b){
        double result=a+b;
        System.out.println(result);


    }
    public void subtraction(int x , double y, int z){
        double result=x-y-z;
        System.out.println(result);
    }
    public void multiplication(int a , double b) {
        double result = a * b;
        System.out.println(result);
    }
    public void division(int a , double b) {
        double result = a / b;
        System.out.println(result);
    }
        public static void main (String[]args){

            CalculatorWithInputPara z = new CalculatorWithInputPara();
            z.addition(254, 15.24);
            z.subtraction(10, .95, 3);
            z.multiplication(22,19.3);
            z.division(15,7.5);
        }
    }

