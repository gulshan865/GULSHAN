package fourth;

public class with_input_para {
    public void message(String name){
        System.out.println(name);
    }
    public void message(String name,int age){
        System.out.println( name + age);
    }

    public static void main(String[] args) {
        with_input_para obj = new with_input_para();
        obj.message("ashok");
        obj.message("ashish",26);
    }
}
