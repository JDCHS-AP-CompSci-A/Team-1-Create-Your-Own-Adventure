
import java.util.ArrayList;
import java.util.Random;

public class RoomGen {
    int numRoom;
    ArrayList<Room> roomlist = new ArrayList();
    Random dice = new Random();
    int r = dice.nextInt(4) + 3;
    int e = dice.nextInt(3) + 1;
    
    /**
     * Function spawns 4 types of rooms based on what the 'dice' random number generator rolls
     */
    public void getroom() {
        for(int i = 0; i < this.r; i++){
            int type = dice.nextInt(4) + 1;
            if(type == 1){
                this.roomlist.add(new Room ("The entrance of an old Egyptian palace..."));
            }if(type == 2){
                this.roomlist.add(new Room("You fell through a trap door into a pit... "));
            }if(type == 3){
                this.roomlist.add(new Room("The entrance of a mysterious tunnel..."));
            }if(type == 4){
                this.roomlist.add(new Throne("The throne room!"));
                
            }
        }
    }
    /**
     * toString function for RoomGen class, prints out types of rooms that are spawned
     * @return String named blank defined in toString function
     */
    public String toStringGen(){
        String blank = "";
        for(int i = 0; i < this.roomlist.size(); i++){
              Room room = this.roomlist.get(i);
              blank += room.toString();
        }
        return blank;
    }
}
