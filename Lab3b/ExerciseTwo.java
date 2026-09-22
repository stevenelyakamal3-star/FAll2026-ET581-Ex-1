
import java.util.Scanner;



public class ExerciseTwo{
    public static void main(String[] args){
        System.out.println("Enter a number: ");
        Scanner input = new Scanner(System.in);

        int number;
        number = input.nextInt();
        for(int i = 1; i<11; i++){
            int result;
            result = number * i;
            System.out.println(number + " x " + i  + " = " + result);

        }




    }
}