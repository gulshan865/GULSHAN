package model;

public class Employe {

    public static Object var1;
    String name;
    String position;
    int id_no;
    Double salary;

    public Employe(String name, String position, int id_no, Double salary) {
        this.name = name;
        this.position = position;
        this.id_no = id_no;
        this.salary = salary;
    }

    public static Object getVar1() {
        return var1;
    }

    public static void setVar1(Object var1) {
        Employe.var1 = var1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getId_no() {
        return id_no;
    }

    public void setId_no(int id_no) {
        this.id_no = id_no;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}





