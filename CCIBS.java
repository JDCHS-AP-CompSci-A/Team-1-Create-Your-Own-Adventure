
import java.util.ArrayList;
import java.util.Scanner;

public class CCIBS {

    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        System.out.println("Welcome to Crash Course in Brain Surgery");

        Player player_test = new Player("Jacob", 400.0);
        System.out.println(player_test.toString());
        System.out.println();
        
        ArrayList<Room> roomlist = new ArrayList();
        Room room_test = new Room("test");
        Room dungeon = new Room("test");
        roomlist.add(dungeon);
        roomlist.add(room_test);
        
        while (!roomlist.isEmpty()) {
            Room current_room = roomlist.get(player_test.position);
            System.out.println(current_room);
            System.out.println("Would you like to move forward? (Hit 1 to move forward)");
            int input = user_input.nextInt();
            user_input.nextLine();
            if(input == 1) {
               roomlist.remove(player_test.position);
            }
            
    }

        
        
        
//        Throne throne_test= new Throne("Throne Room");
//        System.out.println(throne_test.toStringRoom());
//        RoomGen gen_test = new RoomGen();



//        System.out.print(gen_test);
//        
//        System.out.println();
//        Room room_test = new Room("test");
//        room_test.getenemy();
//        room_test.test();
//        ArrayList<Room> roomlist = new ArrayList();
//        roomlist.add(room_test);
//        roomlist.add(room_test);
//        roomlist.add(room_test);
//        roomlist.add(room_test);
//
//        while (player_test.position < 4) {
//            Room current_room = roomlist.get(player_test.position);
//            current_room.test();
//            System.out.println();
//            System.out.println("Do you want to move? Y/N");
//            Scanner sc = new Scanner(System.in);
//            String YN = sc.nextLine();
//            if (YN == "Y") {
//                player_test.move();
//                continue;
//            
//            }
//            if(YN == "N"){
//                break;                            }
//        }
//            for (int i = 0 ; i < roomlist.size() ; i++){
//                System.out.println(room_test.toString());
//        }
//    }
//    }
}
