package model;

public class Product {

    public static Object goods;

    String name;
    double preice;
    int quantity;

    public Product(String name, double preice, int quantity) {
        this.name = name;
        this.preice = preice;
        this.quantity = quantity;
    }

    public static Object getGoods() {
        return goods;
    }

    public static void setGoods(Object goods) {
        Product.goods = goods;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPreice() {
        return preice;
    }

    public void setPreice(double preice) {
        this.preice = preice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
