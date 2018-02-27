
import java.util.Scanner;

public class ActionMenu {
    Scanner take_action =  new Scanner(System.in);
    String action_symbol;
    
    public String toString(){
        return String.valueOf(takeshot_quit());
    }
    
    public boolean takeshot_quit(){
        this.action_symbol = this.take_action.next();
        this.take_action.nextLine();
        if (this.action_symbol == "Q"){
            return false;
        }else if (this.action_symbol == "1"){        
            }
            return true;
    }
}