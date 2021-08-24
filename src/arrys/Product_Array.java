package arrys;

public class Product_Array {

    public void product() {

        String [] product_name ={"vegitable oil", "corn", "wheet", "hair oil", "coffie",};

        int [] product_price = {120,25,32,50,55};

        for (String product : product_name){
            System.out.println(product);
        }
        for (int product_rate : product_price){
            System.out.println(product_rate);
        }

    }

    public static void main(String[] args) {
        Product_Array details = new Product_Array();
        details.product();
    }
}
