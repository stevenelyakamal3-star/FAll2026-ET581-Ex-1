
import java.util.Scanner;



public class ExerciseFive{
    public static void main(String []args){
        System.out.println("Enter a number: ");
        Scanner input = new Scanner(System.in);
        int number;
        number = input.nextInt();
        if (number%2 != 0){
            System.out.println("Odd number");
        }
        else{
            System.out.println("Even number");
        }
        input.close();


    }



}