import java.util.ArrayList;
import java.util.Random;

public class RoomGen {
    ArrayList<Room> roomlist = new ArrayList();
    Random dice = new Random();
    int r = dice.nextInt(3) + 1;
}
