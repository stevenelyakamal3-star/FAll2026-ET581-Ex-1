
import java.util.Scanner;



public class ExerciseThree{
    public static void main(String []args){
        
        String username = "student";

        
        
        
        
        
        System.out.println("Enter username: ");
        Scanner input = new Scanner(System.in);
        String inputusername;
        inputusername = input.nextLine();
        System.out.println(username.equalsIgnoreCase(inputusername));
        input.close();


    }

}