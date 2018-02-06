import java.util.Random;

public class Enemy {
    
    double health;
    double damage;
    int armor;
    int accuracy;
    
    Enemy(double health, double damage, int armor){
        Random generator = new Random(20);
        this.accuracy = generator.nextInt();
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