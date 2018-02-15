
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
        ArrayList<Room> roomlist = new ArrayList();
        roomlist.add(room_test);
        roomlist.add(room_test);
        roomlist.add(room_test);
        roomlist.add(room_test);

        while (player_test.position < 4) {
            Room current_room = roomlist.get(player_test.position);
            current_room.test();
            System.out.println();
            System.out.println("Do you want to move? Y/N");
            Scanner sc = new Scanner(System.in);
            String YN = sc.nextLine();
            if (YN == "Y") {
                player_test.move();
                continue;
            
            }
            if(YN == "N"){
                break;                            }
        }
            for (int i = 0 ; i < roomlist.size() ; i++){
                System.out.println(room_test.toString());
    }
    }

}
