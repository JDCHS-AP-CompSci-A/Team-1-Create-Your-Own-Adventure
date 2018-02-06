
import java.util.Random;

public class Player {

    double health = 400.0;
    double damage;
    int trgvalue;
    Random dice = new Random();
    int accuracy = dice.nextInt(10) + 1;

    Player() {
        this.damage = 20.0;
    }

    public double Dmg() {
        double damage = this.damage;
        if (this.accuracy == 10) {
            damage = damage * 1.5;
        }
        return damage;
    }
    
    public boolean Shoot(){
          if(this.accuracy <= 4){
              return false;
          }
          else{
              return true;
                      
          }
      }
    
}

