package brain.salad.surgery;
import java.util.Random;
import java.util.ArrayList;

class Room {
    //ArrayList<Enemy> enemylist = new ArrayList();
    Random dice = new Random();
    int e = dice.nextInt(3) + 1;

    public String toString() {
        return "tom";

    }
    /*
    public void getenemy(){
        if(e == 1){
            this.enemylist.add();
        }else if(e == 2)
            this.enemylist.add();
        }else(){
            this.enemylist.add();
        }
    }*/
}
