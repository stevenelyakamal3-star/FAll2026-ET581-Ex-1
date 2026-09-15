
import java.util.Scanner;




public class ExerciseFive{
    public static void main(String []args){
        System.out.println("Enter a string: ");
        Scanner input = new Scanner(System.in);
        String word;
        word = input.nextLine();
        int len = word.length();
        System.out.println("Original length: " + len);
        String newstring = word.trim();
        System.out.println("New string: " + newstring);
        int newstringlen = newstring.length();
        System.out.println("New Length: " + newstringlen);
        
        
        
        
        
        input.close();



    }
}