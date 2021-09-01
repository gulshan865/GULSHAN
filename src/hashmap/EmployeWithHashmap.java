package hashmap;

import model.Employe;

import java.util.HashMap;

public class EmployeWithHashmap {

    public void demo(){

        HashMap<Integer, Employe> company = new HashMap<>();

        Employe person1 = new Employe("hanuman","god",5454,4502.2);
        Employe person2 = new Employe("superman","powerfull",5455,4554502.2);
        Employe person3 = new Employe("batman","engineer",5456,45064484322.2);
        Employe person4 = new Employe("saktiman","gangadher hi saktiman hy",5457,450544462362.2);

        company.put(1 ,person1);
        company.put(2 ,person2);
        company.put(3 ,person3);
        company.put(4 ,person4);

        Employe employe = company.get(1);
        System.out.println(employe.getName());
        System.out.println(employe.getPosition());
        System.out.println(employe.getId_no());
        System.out.println(employe.getSalary());

        employe = company.get(2);
        System.out.println(employe.getName());
        System.out.println(employe.getPosition());
        System.out.println(employe.getId_no());
        System.out.println(employe.getSalary());

        employe = company.get(3);
        System.out.println(employe.getName());
        System.out.println(employe.getPosition());
        System.out.println(employe.getId_no());
        System.out.println(employe.getSalary());

        employe = company.get(4);
        System.out.println(employe.getName());
        System.out.println(employe.getPosition());
        System.out.println(employe.getId_no());
        System.out.println(employe.getSalary());

    }

    public static void main(String[] args) {
        EmployeWithHashmap obj = new EmployeWithHashmap();
        obj.demo();
    }
}
