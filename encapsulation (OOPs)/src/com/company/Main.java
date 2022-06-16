package com.company;

public class Main {


    public static void main(String[] args) {

   /*     Player player = new Player();
        player.health = 100;
        player.name = "Gojo";
        player.weapon = "Gun";

        player.healthLost(50);
        System.out.println("remaining health = " + player.remainingHealth());
//        player.healthLost(60);
//        System.out.println("remaining health = " + player.health);
//        player.remainingHealth();

    */

EnhancedPlayer player = new EnhancedPlayer("kakashi",50,"sharingan");
        System.out.println(player.getHealth());
        player.healthLost(49);
        System.out.println(player.remainingHealth());

    }
}

// in EnhancedPlayer we created a field variables as private and we created constructor so we can pass the values
// only once and so we can restrict the changes of field variables ....for ex..in player class the field variables
// are public and we can increase the health as much as we want (that we should restrict in the game),
// but in enhancedPlayer class we defined fields as private and we assigned the condition that if health exceeds
// 100 then the heath value should automatically assigned as 100 like we defined in field variable .

