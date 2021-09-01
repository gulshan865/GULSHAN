package arrys;

public class CellPhones {

    public void shop(){

        String [] company = {"i phone","oneplus","samsung","sony","oppo"};

        int [] price = {120000,50000,60000,60000,30000};

        for (String producer : company){
            System.out.println(producer);
        }

        for (int rate : price){
            System.out.println(rate);
        }


    }

    public static void main(String[] args) {

        CellPhones order = new CellPhones();
        order.shop();
    }
}
