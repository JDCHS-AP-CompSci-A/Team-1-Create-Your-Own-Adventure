
import java.util.Scanner;
/**
 * 
 * @author jacobwhitehead
 */
public class ActionMenu {
    Scanner user_input = new Scanner(System.in);
    
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

