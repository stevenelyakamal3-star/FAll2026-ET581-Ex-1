
import java.util.Scanner;




public class ExerciseSeven{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        String word;
        while(true){

            System.out.println("Enter a word: ");
            word = input.nextLine();
            if ( word.equals("skip")){
                continue;
            }
            else if (word.equals("quit")){
                break;
            }
            else{
                System.out.println(word);
                
            }

            






        }

        input.close();






    }




}