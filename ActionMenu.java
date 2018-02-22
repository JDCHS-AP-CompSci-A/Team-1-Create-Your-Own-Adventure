
import java.util.Scanner;

public class ActionMenu {
    Scanner take_action =  new Scanner(System.in);
    char action_letter;
    
    public String toString(){
        return String.valueOf(takeshot_quit());
    }
    
    public boolean takeshot_quit(){
        this.action_letter = take_action.next(".").charAt(0);
        if (this.action_letter == 'Q'){
        }
        return false;    
    }
}
