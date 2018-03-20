
import java.util.Random;
import java.util.ArrayList;

class Room {
    String description;
    ArrayList<Enemy> enemylist = new ArrayList();
    Random dice = new Random();
    int e = dice.nextInt(3) + 1;
    /**
     * Constructor creates the string description associated with the room, gets enemy from ArrayList enemy_list
     * @param description - text that describes the room created in RoomGen
     */
    Room (String description){
        this.description = description;
        this.getenemy();
    }
    /**
     * toString function for Room prints types of enemies spawned in enemy_list
     * @return string blank containing text and enemy_list enemies
     */
    public String toString() {
        String blank = this.description;
        blank = blank + "\nYou find " + this.enemylist.size() + " enemies \n";
        for (int l =0;l < this.enemylist.size(); l++)
        {
            blank = blank + l + " " + this.enemylist.get(l).toString() + "\n";
        }
        return blank;
    }
   /**
    * function handling a boolean indicating if enemy_list is empty
    * @return enemy_list is not empty
    */
    public boolean hasEnemies(){
       return !this.enemylist.isEmpty();
    } 
    /**
     * function spawns an enemy, adding them to the ArrayList enemy_list
     */
    public void getenemy(){
        for(int i = 0; i < this.e; i++){
            int type = dice.nextInt(3) + 1;
            if(type == 1){
                this.enemylist.add(new Enemy("Grunt", 20.0, 32.0, 10));
            }if(type == 2){
                this.enemylist.add(new Enemy("Brute", 50.0, 23.0, 20));
            }if(type == 3){
                this.enemylist.add(new Enemy("Elite", 10.0, 100.0, 0));
            }
        }
    }
}