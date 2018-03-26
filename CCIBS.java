
import java.util.ArrayList;
import java.util.Scanner;

public class CCIBS {
    /**
     * creates a new scanner called user_input
     * prints welcome message
     * creates a new player called player_test with attributes "Jacob" and 10000.0
     * prints out attributes created in player_test
     * creates new RoomGen called roomgen and calls getroom function in RoomGen
     * creates a new ActionMenu called action_menu
     * @param args 
     */
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        System.out.println("Welcome to Crash Course in Brain Surgery");

        Player player_test = new Player("The Big Gay", 600.0);
        System.out.println(player_test.toStringPlayer());
        System.out.println();

        RoomGen roomgen = new RoomGen();
        roomgen.getroom();
        ActionMenu action_menu = new ActionMenu();

        /**
         * while loop - calls on roomgen to spawn a room, player is placed in the room, room info is printed
         */
        while (player_test.position < roomgen.roomlist.size()) {
            Room current_room = roomgen.roomlist.get(player_test.position);
            System.out.println("--------------");
            /**
             * while loop - while the spawned room has enemies the player is prompted to choose which enemy to fight and shoot
             */
            while (current_room.hasEnemies()) {

                int position = action_menu.fight_menu(current_room);
                int shoot = action_menu.shoot(current_room, position);
                Enemy enemy_we_fight = current_room.enemylist.get(position);
            /**
             * if player presses 1 to shoot then the player_attack function and the enemy's Attack function will be called
             */    
                if (shoot == 1) {
                    player_test.player_attack(enemy_we_fight);
                    if (enemy_we_fight.enemy_health > 0){
                    enemy_we_fight.Attack(player_test);
                    /**
                     * after player_attack and Attack have ran the enemy's health and player's health will be checked resulting in either an enemy removed or game over for the player
                     */
                    }
                    if (enemy_we_fight.enemy_health <= 0) {
                        current_room.enemylist.remove(position);
                    }
                    if (player_test.player_health <= 0) {
                        System.out.print("You Died, Game Over!!!!!");
                        break;
                    }
                } 
            }
            /**
             * if the ArrayList called enemylist within the spawned room is empty then the player is prompted to change rooms 
             */
            if (current_room.enemylist.isEmpty()){
            int input = action_menu.next_room(current_room, roomgen, player_test);
            if(input == 1) {
                player_test.position += 1;
                }
            }   
            /**
             * if player's health is less than 0 then the game ends
             */
                if (current_room.enemylist.isEmpty()){
                int input = action_menu.next_room(current_room, roomgen, player_test);
                if(input == 1) {
                    roomgen.roomlist.remove(player_test.position);
                    }
                }   
            if (player_test.player_health <= 0) {
                System.out.println("Game Over....");
                break;
            }
            /**
             * if all spawned rooms have been cleared then the player wins, the game is finished
             */
            if (roomgen.roomlist.isEmpty()) {
                System.out.println("You win");
                break;
            }
        }
    } 
}

