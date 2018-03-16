import java.util.ArrayList;
import java.util.Scanner;

public class CCIBS {

    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        System.out.println("Welcome to Crash Course in Brain Surgery");
            
        Player player_test = new Player("Jacob", 10000.0);
        System.out.println(player_test.toStringPlayer());
        System.out.println();

        RoomGen roomgen = new RoomGen();
        roomgen.getroom();
        ActionMenu action_menu = new ActionMenu();

        while (player_test.position < roomgen.roomlist.size()) {
            Room current_room = roomgen.roomlist.get(player_test.position);
            System.out.println("--------------");
            while (current_room.hasEnemies()) {

                int position = action_menu.fight_menu(current_room);
                int shoot = action_menu.shoot(current_room, position);
                Enemy enemy_we_fight = current_room.enemylist.get(position);

                if (shoot == 1) {
                    player_test.player_attack(enemy_we_fight);
                    enemy_we_fight.Attack(player_test);
                    if (enemy_we_fight.enemy_health <= 0) {
                        current_room.enemylist.remove(0);
                    }
                    if (player_test.player_health <= 0) {
                        System.out.print("You Died");
                        break;
                    }
                }
  
            }
                    if (current_room.enemylist.isEmpty()){

                int input = action_menu.next_room(current_room, roomgen, player_test);
                if(input == 1) {
                    player_test.position += 1;
                    }
                }   
            
    
            if (player_test.player_health <= 0) {
                System.out.println("Game Over....");
                break;
            }
            if (roomgen.roomlist.isEmpty()) {
                System.out.println("You win");
                break;
            }
        }
    }
}
