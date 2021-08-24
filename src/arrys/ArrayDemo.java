package arrys;

public class ArrayDemo {

    public void demo(){

        String [] nameArray = {"rahul","ashok","lokendra","ashish","akash",};
        int [] nameArray2 = {1,2,3,4,5};

        System.out.println(nameArray[3]);

        for (int i=0; i<nameArray.length; i++){

            System.out.println(nameArray[2]);
        }

        //for (String var : nameArray){
            //System.out.println(var);

        }
       // for (int var2 : nameArray2){
           // System.out.println(var2);
       // }

  //  }

    public static void main(String[] args) {
        ArrayDemo obj = new ArrayDemo();
        obj.demo();
    }
}
