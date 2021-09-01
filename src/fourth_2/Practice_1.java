package fourth_2;

public class Practice_1{

    public String mobile(){

        String phone = "oneplus";
        return phone;
    }

    public String mobile1(){

        String phone ="samsung";
        return phone;
    }

    public String mobile2(){

        String phone = "iphone";
        return phone;
    }

    public int cost_mobile(){

        int price = 50000;
        return price;
    }

    public int cost_mobile1(){

        int price = 60000;
        return price;
    }

    public int cost_mobile2(){

        int price = 120000;
        return price;
    }

    public static void main(String[] args) {
       Practice_1 cellphone = new Practice_1();

        String mobile = cellphone.mobile();
        System.out.println(mobile);

        int cost_mobile = cellphone.cost_mobile();
        System.out.println(cost_mobile);

        String mobile1 = cellphone.mobile1();
        System.out.println(mobile1);

        int cost_mobile1 = cellphone.cost_mobile1();
        System.out.println(cost_mobile1);

        String mobile2 = cellphone.mobile2();
        System.out.println(mobile2);

        int cost_mobile2 = cellphone.cost_mobile2();
        System.out.println(cost_mobile2);
        }
}
