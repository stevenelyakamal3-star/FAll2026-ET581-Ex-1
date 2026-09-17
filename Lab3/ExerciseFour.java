
import java.util.Scanner;






public class ExerciseFour{
    public static void main(String[] args){
        System.out.println("Input: ");
        Scanner input = new Scanner(System.in);
        String word;
        word = input.nextLine();
        System.out.println("Characters to exclude: ");
        char letter;
        letter = input.next().charAt(0);
        





        
        int index = 0;
        System.out.print("Output: ");

        while(index<word.length()){
           
            if (word.charAt(index) != letter){
           
           
            System.out.print(word.charAt(index));

            
            
            }
        index++;
        }
        System.out.println();

        
        input.close();





    }




}