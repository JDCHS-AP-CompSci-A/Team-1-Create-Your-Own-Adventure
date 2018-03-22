
import java.util.Random;
/**
 * Constructor  extends enemy and takes in armor, health, name, and damage
 * @author nicholasreagan
 */
public class Boss extends Enemy{
     public Boss (String name, double health, double damage, int armor){
         super(name, health, damage, armor);
    }
     /**
      * Function allows the Boss to regenerate health
      */
    public void Regen(){
        if (this.enemy_health < 240){
            this.enemy_health += 5;
        }
        else{
            System.out.println("They seem to be at full strength!");
        }
    }
}
