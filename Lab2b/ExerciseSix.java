
import java.util.Scanner;


public class ExerciseSix{
    public static void main(String []args){

        System.out.println("Enter a number: ");
        Scanner input = new Scanner(System.in);
        int number;
        number = input.nextInt();
        if (number>0){
            System.out.println("Positive");
        
        }
        else if(number<0){
            System.out.println("Negative");

        }
        else{
            System.out.println("Zero");
        }
        input.close();

    }
}