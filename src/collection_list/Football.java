package collection_list;

import java.util.ArrayList;

public class Football {

    public void game(){

        ArrayList <String> players = new ArrayList<String>();

        players.add("lional messi");
        players.add("cristiano ronaldo");
        players.add("naymar junior");
        players.add("devid beckhaman");

        for (String player:players){
            System.out.println(player);
        }
    }

    public static void main(String[] args) {
        Football sport =new Football();
        sport.game();
    }
}
