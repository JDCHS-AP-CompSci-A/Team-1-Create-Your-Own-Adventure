
import java.util.Random;
import java.util.ArrayList;

public class Throne extends Room {

    public Throne(String description) {
        super(description);
    }

    @Override
    public void getenemy() {
        Enemy Boss = new Boss("Boss", 240.0, 60.0, 30);
                this.enemylist.add(Boss);
            
        }
    }

