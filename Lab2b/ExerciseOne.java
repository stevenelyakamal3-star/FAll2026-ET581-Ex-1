
import java.util.Scanner;




public class ExerciseOne{
    public static void main(String []args){
        System.out.println("Enter first number: ");
        Scanner input = new Scanner(System.in);
        int a;
        a = input.nextInt();
        System.out.println("Enter second number: ");
        int b;
        b = input.nextInt();
        System.out.println("Numbers are equal: " + (a == b));
        input.close();





    }
}