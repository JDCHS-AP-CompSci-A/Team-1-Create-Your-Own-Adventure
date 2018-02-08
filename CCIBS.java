public class CCIBS {


    public static void main(String[] args) {
       System.out.println("Welcome to Crash Course and Brain Surgery");
        
       Player player_test = new Player();       
       System.out.println(player_test.Dmg());
       System.out.println(player_test.Shoot());
       
       Enemy Grunt = new Enemy(20.0, 23.0, 10);
       Enemy Brute = new Enemy(50.0, 32.0, 20);
       Enemy Elite = new Enemy(15.0, 100.0, 0);
       Enemy Boss = new Enemy(240.0, 60.0, 30);  //Boss has separate subclass
     
       //Room room_test = new Room();
       //System.out.println(room_test); 
    }

}