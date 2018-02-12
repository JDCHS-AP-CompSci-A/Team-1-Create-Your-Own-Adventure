import java.util.Random;

public class Enemy {
    
    String name;
    double health;
    double damage;
    int armor;
    Random dice = new Random();
    int accuracy = dice.nextInt(20) + 1;
    
    public Enemy(String name, double health, double damage, int armor){
        this.name = name;
        this.health = health;
        this.damage = damage;
        this.armor = armor;
    }
      
    public double Dmg(){
          double damage = this.damage;
          if(this.accuracy == 20){
              damage = damage*1.5;
          }      
          return damage;
    }
    
    public boolean Shoot(){
          if(this.accuracy <= 13){
              return false;
          }
          else{
              return true;            
          }
    }

    public String toString(){
        return this.name + " " + String.valueOf(this.health) + " " + String.valueOf(this.damage) + " " + String.valueOf(this.armor);
    }
    
    }