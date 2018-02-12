
import java.util.Random;

public class Player {

    double player_health;
    double base_damage = 10;
    int trgvalue;
    Random dice = new Random();

    Player(double player_health){
        this.player_health = player_health;
    }

    public double Dmg() {
        double damage = this.base_damage;
        int accuracy = dice.nextInt(10) + 1;
        if (accuracy == 10) {
            damage = this.base_damage * 1.5;
        }
        return damage;
    }
    
    public boolean Shoot(){
         int accuracy = dice.nextInt(10) + 1;
          if(accuracy <= 4){
              return false;
          }
          else{
              return true;
                      
          }
      }
    
}

