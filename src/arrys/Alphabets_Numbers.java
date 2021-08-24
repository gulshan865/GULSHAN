package arrys;

public class Alphabets_Numbers {

    public void practice(){

        String [] alphabets = {"A","B","c","D","E","F","G","H","I","J","K","L"};
        int [] numbers = {1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 , 10 , 11 , 12};

        for (String alfab : alphabets){
            System.out.println(alfab);
        }
        for (int digits : numbers ) {
            System.out.print(digits);
        }

    }

    public static void main(String[] args) {
        Alphabets_Numbers demo = new Alphabets_Numbers();
                demo.practice();
    }

}
