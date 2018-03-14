
import java.util.Scanner;

public class ActionMenu {
    Scanner user_input = new Scanner(System.in);
    
    public int fight_menu(Room current_room) {
        System.out.println(current_room);
        System.out.println("--------------");
        System.out.println("who will you fight?");
        System.out.println("--------------");
        int position = user_input.nextInt();
        user_input.nextLine();
        System.out.println("--------------");

        return position;
    }
    
    public int shoot(Enemy enemy_we_fight, Room current_room, int position){
  
        current_room.enemylist.get(position);
        System.out.println("Targetted enemy " + enemy_we_fight);
        System.out.println(enemy_we_fight);
        System.out.println("--------------");
        System.out.println("Would you like to shoot? (1)");
        
        int shoot = user_input.nextInt();
        user_input.nextLine();
        
        return shoot;   
    }
    
    public void next_room(Room current_room, RoomGen roomgen, Player player_test){
        if(current_room.enemylist.isEmpty()) {
        System.out.println("--------------");
        System.out.println("All enemies have been defeated");
        System.out.println("--------------");
        System.out.println("Would you like to move forward? (Hit 1 to move forward)");
        int input = user_input.nextInt();
        user_input.nextLine();
            if(input == 1) {
               roomgen.roomlist.remove(player_test.position);
            }
        }
    }       
}

