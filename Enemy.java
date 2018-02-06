import java.util.Random;

public class Enemy {
    
    double health;
    double damage;
    int armor;
    Random dice = new Random();
        int accuracy = dice.nextInt(20) + 1;
    
    Enemy(double health, double damage, int armor){
        this.damage = damage;
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

        
    }