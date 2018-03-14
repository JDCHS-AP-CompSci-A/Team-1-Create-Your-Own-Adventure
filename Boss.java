
import java.util.Random;

public class Boss extends Enemy{
     public Boss (String name, double health, double damage, int armor){
         super(name, health, damage, armor);
    }
     
    public void Regen(){
        if (this.enemy_health < 240){
            this.enemy_health += 5;
        }
        else{
            System.out.println("They seem to be at full strength!");
        }
    }
}
