package com.company;

public class Player {

    public String name;
    public int health;
    public String weapon;

    public void healthLost(int damage){
        this.health= this.health - damage;
        System.out.println("damage took = "+damage);
    }
    public int remainingHealth(){
        if(this.health <= 0){
            System.out.println("Player is knocked out");
        }
        return this.health;
    }

}
