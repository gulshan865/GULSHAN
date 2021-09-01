package hashmap;

import model.Product;

import java.util.HashMap;

public class ProductHashMap {

    public void demo(){

        HashMap<Integer, Product> goods = new HashMap();

        Product saman1 = new Product("paneer",240.0,1);
        Product saman2 = new Product("tomato",20.0,5);
        Product saman3 = new Product("onion",40.0, 2);
        Product saman4 = new Product("pea",30.0,10 );
        Product saman5 = new Product("potato",20.0,4);

        goods.put(1,saman1);
        goods.put(2,saman2);
        goods.put(3,saman3);
        goods.put(4,saman4);
        goods.put(5,saman5);

        Product saman = goods.get(1);
        System.out.println(saman.getName());
        System.out.println(saman.getPreice());
        System.out.println(saman.getQuantity());

        saman = goods.get(2);
        System.out.println(saman.getName());
        System.out.println(saman.getPreice());
        System.out.println(saman.getQuantity());

        saman = goods.get(3);
        System.out.println(saman.getName());
        System.out.println(saman.getPreice());
        System.out.println(saman.getQuantity());

        saman = goods.get(4);
        System.out.println(saman.getName());
        System.out.println(saman.getPreice());
        System.out.println(saman.getQuantity());

         saman = goods.get(5);
        System.out.println(saman.getName());
        System.out.println(saman.getPreice());
        System.out.println(saman.getQuantity());

    }

    public static void main(String[] args) {
        ProductHashMap obj = new ProductHashMap();
        obj.demo();
    }
}
