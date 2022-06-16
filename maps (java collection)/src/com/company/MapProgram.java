package com.company;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {

    public static void main(String[] args) {
        Map<String,String> players = new HashMap<>();

        players.put("Virat","Greatest ODI player of all time");
        players.put("Rohit","One of the greats of the game");
        players.put("Dhoni","only captain to win all ICC trophies");
        players.put("Sachin","God of cricket");
        players.put("Shardul","Lord, all should bow before him");
        


/*        System.out.println(players.put("Virat","King of all formats in cricket"));
           The output for this will be *Greatest ODI player of all time* because it was defined before
           *King of all formats in cricket*
 */

/*

    **** testing (if the player is already defined then we can avoid defining same player again irrespective
         of key's value

        if(players.containsKey("Virat")){
            System.out.println("Viart, key is already defined");
        }else{
            players.put("Virat","King of all formats in cricket");
            System.out.println("Virat, Added successfully");
        }

        if(players.containsKey("Kl Rahul")){
            System.out.println("Kl Rahul, key is already defined");
        }else{
            players.put("Kl Rahul","Classy player");
            System.out.println("kl rahul, Added successfully");
        }
*/

        if(players.remove("Shardul","Lord")){
            System.out.println("removed successfully");
        }else{
            System.out.println("Shardul not removed, key/value pair not found");
        }

        players.remove("Kl Rahul");

        players.replace("Shardul","Lord, all should bow before him","Replaced the value");



        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");

        for(String key : players.keySet()){
            System.out.println(key+" : "+players.get(key));
      // the output will not be in added order or alphabetical order(just random order)
        }


    }

}
