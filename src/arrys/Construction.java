package arrys;

public class Construction {



    public void price(){

        String [] material = {"cement","bricks","sand","sariya","gitti","labour charge"};
        for (String saman : material){
            System.out.println(saman);
        }

        int [] material_cost = {90000,40000,70000,120000,65000,120000};
        for (int money : material_cost ){
            System.out.println(money);

        }

    }

    public static void main(String[] args) {
        Construction work = new Construction();
        work.price();

    }
}
