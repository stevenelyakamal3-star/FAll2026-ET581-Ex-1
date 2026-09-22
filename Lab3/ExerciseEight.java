
import java.util.Scanner;





public class ExerciseEight{
    public static void main(String[] args){
        System.out.println("Input: ");
        Scanner input = new Scanner(System.in);
        String word;
        word = input.nextLine().toUpperCase();

        int position = 0;
        String result = "";

        while(position<word.length()){
            char currentcharacter = word.charAt(position);
            int alphabetposition = currentcharacter - 'A';

            int newposition = alphabetposition +3;
            newposition = newposition % 26;

            char newcharacter = (char)('A'+newposition);

            result = result + newcharacter;

            position++;



        }
        System.out.println("Output: " + result);
        




        input.close();





    }
}