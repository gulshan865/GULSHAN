package fourth_2;

public class Bike {
    public String motorcycle(){

        String brand = "yamaha";
        return brand;
    }

    public int cost(){
        int price = 95000;
        return price;
    }

    public static void main(String[] args) {
        Bike details = new Bike();

        String motorcycle = details.motorcycle();
        System.out.println(motorcycle);

        int cost = details.cost();
        System.out.println(cost);

    }
}
