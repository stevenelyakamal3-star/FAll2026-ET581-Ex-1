
import java.util.Scanner;




public class ExerciseSix{
    public static void main(String[] args){
 


    
        int num = 0;
        Scanner input = new Scanner(System.in);
        while(num<=0){
   
            System.out.println("Enter a number: ");
            
            num = input.nextInt();
        
        }
        System.out.println("Valid number");

        input.close();


    }
}