
import java.util.Random;
import java.util.ArrayList;
/**
 * Throne extends room
 * @author nicholasreagan
 */
public class Throne extends Room {
/**
 * Constructor takes in description
 * @param description 
 */
    public Throne(String description) {
        super(description);
    }
/**
 * Function overrides the getenemy function from enemy so that only the boss can spawn in throne
 */
    @Override
    public void getenemy() {
        Enemy Boss = new Boss("Boss", 200.0, 50.0, 30);
                this.enemylist.add(Boss);
            
        }
    }

