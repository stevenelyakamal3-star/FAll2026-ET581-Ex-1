
import java.util.Scanner;



public class ExerciseFour{
    public static void main(String []args){
        System.out.println("Enter a string: ");
        Scanner input = new Scanner(System.in);
        String str;
        str = input.nextLine();
        System.out.println(str);
        String lowercase = str.toLowerCase();
        System.out.println(lowercase);
        String uppercase = str.toUpperCase();
        System.out.println(uppercase);
        
        
        input.close();



    }
}