package fourth;

public class Employees {

    public void employees(String name,int salary, double date){
        System.out.println("name is:"+name   +  " he was paid:"+salary +" on "+date);
    }

    public static void main(String[] args) {
        Employees one = new Employees();
        one.employees("ashok",  15000 ,27.04);
        one.employees("ashish",25000 , 28.04);
    }
}
