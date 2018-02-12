public class CCIBS {


    public static void main(String[] args) {
       System.out.println("Welcome to Crash Course and Brain Surgery");
        
       Player player_test = new Player(400.0);       
       System.out.println(player_test.Dmg());
       System.out.println(player_test.Shoot());
       
       
       
  //Boss has separate subclass
     
       Room room_test = new Room();
       room_test.getenemy();
       room_test.test();
    }

}