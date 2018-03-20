
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
    public Enemy(String name, double health, double damage, int armor){
        this.name = name;
        this.enemy_health = health;
        this.enemy_damage = damage;
        this.armor = armor;
    }
      
    public double Dmg(){
        int accuracy = dice.nextInt(20) + 1;
          double damage = this.enemy_damage;
          if(accuracy == 20){
              damage = damage*1.5;
          }      
          return damage;
    }
    
    public boolean Shoot(){
          int accuracy = dice.nextInt(20) + 1;
          if(accuracy <= 9){
              return false;
          }
          else{
              return true;            
          }
    }
    
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

    public String toString(){
        return this.name + " " + String.valueOf(this.enemy_health) + "\u2665 " + String.valueOf(this.enemy_damage) + "\u2694 " + String.valueOf(this.armor) + " \u1F6E1";
    }
    
    }