
import java.util.Scanner;


public class ExerciseSeven{
    public static void main(String []args){

        System.out.println("Enter a number: ");
        Scanner input = new Scanner(System.in);
        int number;
        number = input.nextInt();
        boolean isNumberEven = (number%2==0)? true: false;
        System.out.println(isNumberEven);
        input.close();

    }
}