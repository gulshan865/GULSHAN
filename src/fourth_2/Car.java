package fourth_2;

import javax.naming.Name;

public class Car {

    public String company() {

        String brand = "kia";
        return brand;
    }
    public String product(){
        String product_name = "seltos";
        return product_name;
    }

    public int cost(){
        int price = 750000;
        return price;
    }

    public static void main(String[] args) {

        Car details = new Car();
        String company = details.company();
        System.out.println(company);

        String product = details.product();
        System.out.println(product);

        int price = details.cost();
        System.out.println(price);
    }
}
