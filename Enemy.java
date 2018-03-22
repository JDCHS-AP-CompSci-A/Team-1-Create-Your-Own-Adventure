
import java.util.Random;

public class Enemy {
    String name;
    double enemy_health;
    double enemy_damage;
    int armor;
    Random dice = new Random();
    /**
     * 
     * @param name enemy name
     * @param health enemy health 
     * @param damage enemy damage
     * @param armor enemy armor
     */
    /**
     * Constructor handles enemy name, health, damage, and armor
     * @param name Name of the enemy
     * @param damage A range of damage an enemy deals
     * @param health Numerical amount of health the enemy has
     * @param armor A value that dictates how hard it is to hit said enemy
     */
    public Enemy(String name, double health, double damage, int armor){
        this.name = name;
        this.enemy_health = health;
        this.enemy_damage = damage;
        this.armor = armor;
    }
    /**
     * Function calculates amount of damage an enemy deals
     * @return a double that is the amount of damage an enemy will deal to the player
     */
    public double Dmg(){
        int accuracy = dice.nextInt(20) + 1;
          double damage = this.enemy_damage;
          if(accuracy == 20){
              damage = damage*1.5;
          }      
          return damage;
    }
    /**
     * Function determines if an enemy hits or misses
     * @return boolean determining hit or miss
     */
    public boolean Shoot(){
          int accuracy = dice.nextInt(20) + 1;
          if(accuracy <= 9){
              return false;
          }
          else{
              return true;            
          }
    }
    /**
     * Function deals damage to the player
     * @param player 
     */
    public void Attack(Player player){
        boolean did_hit = this.Shoot();
        if(did_hit){
            double damage_done = this.Dmg();
            player.player_health -= damage_done;
            System.out.println(this.name + " " + "attacks and hits for " + damage_done + " health");
            System.out.println("Your health is " + player.player_health);
            System.out.println("--------------");
            
        }
        else {
            System.out.println(this.name + " missed \n");
          
        }
    }
/**
 * Function creates a string that states the health, damage, and name of the enemy
 * @return a string that prints the health, damage, and name of enemy
 */
    public String toString(){
        return this.name + " " + String.valueOf(this.enemy_health) + "\u2665 " + String.valueOf(this.enemy_damage) + "\u2694 " + String.valueOf(this.armor) + " \u1F6E1";
    }
    
    }