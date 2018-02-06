public class CCIBS {


    public static void main(String[] args) {
       Enemy enemy_test = new Enemy(20.0, 20.0, 20);

       System.out.println(enemy_test.Dmg());
       System.out.println(enemy_test.Shoot());
       
       Player player_test = new Player();
       
       System.out.println(player_test.Dmg());
       System.out.println(player_test.Shoot());
       
       Room room_test = new Room();
       System.out.println(room_test);
    }

}