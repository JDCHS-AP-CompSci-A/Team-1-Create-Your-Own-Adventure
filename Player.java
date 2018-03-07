
import java.util.Random;

public class Player {
    String name;
    double damage;
    double player_health;
    double base_damage = 10;
    int trgvalue;
    Random dice = new Random();
    int position = 0;
    
    Player(String name, double player_health){
        this.player_health = player_health;
        this.name = name;
    }

    public double Dmg() {
        this.damage = this.base_damage;
        int accuracy = dice.nextInt(10) + 1;
        if (accuracy == 10) {
            this.damage = this.base_damage * 1.5;
        }
        return this.damage;
    }
    
    public boolean Shoot(){
        int accuracy = dice.nextInt(10) + 1;
        if(accuracy <= 4){
            return false;
        }else{
            return true;           
        }
    }
    
    public void move(){
        this.position += 1;
    }
    public void player_attack(Enemy enemy){
        if (this.Shoot() ){
            System.out.println("HIT");
            System.out.println();
            enemy.enemy_health = enemy.enemy_health - this.Dmg();
            System.out.println("You Deal " + this.Dmg() + " damage...");
            System.out.println();
            System.out.println("The enemy has " + enemy.enemy_health + " health...");
            System.out.println("--------------");
            
        }
    }
    

    public String toStringPlayer(){
        return this.name + (" \n") + String.valueOf(this.player_health) + " \u2665";  
    }
}

