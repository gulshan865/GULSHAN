package arrys;

public class Collage {

    public void collage(){

        String [] course = {"Btech","Bsc","Mtech","BA","diploma","MBA"};
        for (String stream : course){
            System.out.println(stream);
        }

        int [] years = {4,3,2,2,3,2};
        for (int duration : years){
            System.out.println(duration);
        }

        double [] fees = {120000,80000,120000,50000,30000,120000};
        for (double tutionfee : fees){
            System.out.println(tutionfee);
        }
    }

    public static void main(String[] args) {
        Collage template = new Collage();
        template.collage();
    }
}
