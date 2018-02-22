
import java.util.ArrayList;
import java.util.Scanner;

public class CCIBS {

    public static void main(String[] args) {
        System.out.println("Welcome to Crash Course in Brain Surgery");

        Player player_test = new Player(400.0);
        System.out.println("You have currently have " + player_test.toString() + " HP");
        System.out.println(player_test.Dmg());

        //Boss has separate subclass
        Room room_test = new Room("test");
        room_test.getenemy();
        room_test.test();
        RoomGen roomgen_test = new RoomGen(4);
        ArrayList<Room> roomlist = roomgen_test.roomlist;

        while (player_test.position < roomgen_test.roomlist.size()) {
            Room current_room = roomgen_test.roomlist.get(player_test.position);
            current_room.test();
            System.out.println();
            System.out.println("Do you want to move? Y/N");
            Scanner sc = new Scanner(System.in);
            String YN = sc.nextLine();
            if ("Y".equals(YN)) {
                player_test.move();
                continue;
            
            }
            if("N".equals(YN)){
                break;        
                    }
        }
            if (roomgen_test.roomlist.size() == 4){
                System.out.println("End");
                break;
            }
        }
            for (int i = 0 ; i < roomgen_test.roomlist.size() ; i++){
                System.out.println(roomgen_test.toString());
    }
    }

}
