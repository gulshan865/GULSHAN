package set;

import model.Employe;

import java.util.HashSet;

public class SetOfEmploye {

    public void demo(){

        HashSet<Employe> company = new HashSet<>();

        Employe employe1 = new Employe("Ashok dubey","salesman",1235,15000.35);
        Employe employe2= new Employe("Ashish sharma","trainer",1236,40000.55);
        Employe employe3 = new Employe("Lokender jadon","developer",1237,18000.35);
        Employe employe4 = new Employe("Akash sharma","shop owner",1238,22000.35);
        Employe employe5 = new Employe("Gulshan kumar","developer",1239,50000.35);

        company.add(employe1);
        company.add(employe2);
        company.add(employe3);
        company.add(employe4);
        company.add(employe5);

        for (Employe people : company){
            System.out.println(people.getName());
            System.out.println(people.getId_no());
            System.out.println(people.getPosition());
            System.out.println(people.getSalary());


        }
    }

    public static void main(String[] args) {
        SetOfEmploye obj = new SetOfEmploye();
        obj.demo();
    }
}
