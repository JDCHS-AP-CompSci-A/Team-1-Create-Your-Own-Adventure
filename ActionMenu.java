
import java.util.Scanner;
/**
 * 
 * @author ryanbarbera
 */
public class ActionMenu {
    Scanner user_input = new Scanner(System.in);
    /**
     * Select what enemy to fight.
     * @param current_room list of enemies in that room.
     * @return who the player will be fighting.
     */
    public int fight_menu(Room current_room) {
        System.out.println(current_room);
        System.out.println("--------------");
        System.out.println("who will you fight?");
        System.out.println("--------------");
        int position = user_input.nextInt();
        user_input.nextLine();
        if(position > current_room.enemylist.size() - 1) {
            System.out.println("ERROR enter a valid position");
            return fight_menu(current_room);
        } 
        System.out.println("--------------");

        return position;
    }
    /**
     * Selects ability to shoot
     * @param current_room Used for enemy list.
     * @param position What specific enemy they're fighting.
     * @return Shoots enemy.
     */
    public int shoot(Room current_room, int position){
        Enemy enemy_we_fight = current_room.enemylist.get(position);
        System.out.println("Targetted enemy " + enemy_we_fight);
        System.out.println(enemy_we_fight);
        System.out.println("--------------");
        System.out.println("Would you like to shoot? (1)");
        
        int shoot = user_input.nextInt();
        user_input.nextLine();
        
        return shoot;   
    }
    /**
     * Moves to the next room instance.
     * @param current_room Looks at the room list.
     * @param roomgen Generates the next room.
     * @param player_test Uses the player themselves to move.
     * @return The move command of "1"
     */
    public int next_room(Room current_room, RoomGen roomgen, Player player_test){
        System.out.println("--------------");
        System.out.println("All enemies have been defeated");
        System.out.println("--------------");
        System.out.println("Would you like to move forward? (Hit 1 to move forward)");
        int input = user_input.nextInt();
        user_input.nextLine();
        return input;
   
}
}

