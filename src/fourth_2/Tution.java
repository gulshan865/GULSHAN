package fourth_2;

public class Tution {

    public String student1() {
        String name = "raj";
        return name;

    }

    public int arrangment() {
        int rollnumber = 1;
        return rollnumber;

    }

    public String student2(){
        String name ="ram";
        return name;
    }

    public int arrangent(){
        int rollnumber = 2;
        return rollnumber;
    }

    public static void main(String[] args) {
        Tution batch =new Tution();

        String student1 = batch.student1();
        System.out.println(student1);

        int arrangment = batch.arrangment();
        System.out.println(arrangment);

        String student2 = batch.student2();
        System.out.println(student2);

        int arrangent = batch.arrangent();
        System.out.println(arrangent);
    }

}

