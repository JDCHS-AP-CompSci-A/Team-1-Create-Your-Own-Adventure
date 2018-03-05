
import java.util.Random;
import java.util.ArrayList;

class Room {
    String description;
    ArrayList<Enemy> enemylist = new ArrayList();
    Random dice = new Random();
    int e = dice.nextInt(3) + 1;
    
    Room (String description){
        this.description = description;
        this.getenemy();
    }

    public String toString() {
        String blank = this.description;
        blank = blank + "\nYou find " + this.enemylist.size() + " enemies \n";
        for (int l =0;l < this.enemylist.size(); l++)
        {
            blank = blank + this.enemylist.get(l).toString() + "\n";
        }
        return blank;
    }
   public void getenemy(){
       Enemy Grunt = new Enemy("Grunt", 20.0, 23.0, 10);
       Enemy Brute = new Enemy("Brute", 50.0, 32.0, 20);
       Enemy Elite = new Enemy("Elite", 15.0, 100.0, 0);
       
        
        for(int i = 0; i < this.e; i++){
            int type = dice.nextInt(3) + 1;
            if(type == 1){
                this.enemylist.add(Grunt);
            }if(type == 2){
                this.enemylist.add(Brute);
            }if(type == 3){
                this.enemylist.add(Elite);
            }
           
        }
        
    }
    
}