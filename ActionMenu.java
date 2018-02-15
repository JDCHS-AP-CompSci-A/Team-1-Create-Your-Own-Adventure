import java.util.Scanner;

public class ActionMenu {
     Scanner take_action =  new Scanner(System.in);
    int action_num;
    char action_letter;
    
    public void instructions(){
        System.out.println("Welcome to the player action menu! Please press 1 to take a shot or 'Q' to quit");
    }
    
    public int takeshot(int action_num){
        this.action_num = take_action.nextInt();
        if(this.action_num == 1){   
        }
        return 1;
    }
     
    public boolean quit(char action_letter){
        if(this.action_letter == 'Q'){
        }
        return true;
    }  
}
