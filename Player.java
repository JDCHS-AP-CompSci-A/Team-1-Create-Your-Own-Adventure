
import java.util.Random;

public class Player {
    String name;
    double damage;
    double player_health;
    double base_damage = 1000;
    int trgvalue;
    Random dice = new Random();
    int position = 0;
    
    /**
     * Constructor handles player name and health
     * @param name The name of the player
     * @param player_health Numerical amount of health the player has
     */
    Player(String name, double player_health){
        this.player_health = player_health;
        this.name = name;
    }
    /**
     * Function calculates damage done
     * @return the numerical amount of damage the player deals based on what the 'dice' rolls
     */
    public double Dmg() {
        this.damage = this.base_damage;
        int accuracy = dice.nextInt(10) + 1;
        if (accuracy == 10) {
            this.damage = this.base_damage * 1.5;
        }
        return this.damage;
    }
    /**
     * Function rolls a dice to determine if the player hits or misses
     * @return boolean indicating hit or miss
     */
    public boolean Shoot(){
        int accuracy = dice.nextInt(10) + 1;
        if(accuracy <= 4){
            return false;
        }else{
            return true;           
        }
    }
    /**
     * Function allows player to change room
     */
    public void move(){
        this.position += 1;
    }
    /**
     * Function handles dialogue and how much damage player deals 
     * @param enemy the literal enemy player will attack
     */
    public void player_attack(Enemy enemy){
        if (this.Shoot() ){
            System.out.println("--------------");
            System.out.println("HIT");
            enemy.enemy_health = enemy.enemy_health - this.Dmg();
            System.out.println("You Deal " + this.Dmg() + " damage...");
            System.out.println("The enemy has " + enemy.enemy_health + " health...");
            System.out.println("--------------");
            
        } else {
            System.out.println("--------------");
            System.out.println("MISS");
            System.out.println();
        }
    }
    /**
     * Prints health and name
     * @return health and name attributes from constructor
     */
    public String toStringPlayer(){
        return this.name + (" \n") + String.valueOf(this.player_health) + " \u2665";  
    }
}

