
import java.util.Scanner;





public class ExerciseFour{
    public static void main(String[] args){

        System.out.println("Enter a string: ");
        Scanner input = new Scanner(System.in);
        String word;
        word = input.nextLine();
        int count = 0;
        
        
        for(int i = 0; i<word.length(); i++){
            if (Character.isUpperCase(word.charAt(i))){
                count++;



            }

        }

        System.out.println("Uppercase letters: " + count);




    }
}