
import java.util.Scanner;



public class ExerciseTwo{

    public static void main(String []args){
        System.out.println("Enter first string: ");
        Scanner input = new Scanner(System.in);
        String a;
        a = input.next();
        System.out.println("Enter second string: ");
        String b;
        b = input.next();
        boolean equals = a.equals(b);
        System.out.println("Strings are equal: " + equals);
        input.close();



    }
}