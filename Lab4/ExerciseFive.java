
import java.util.Scanner;







public class ExerciseFive{

     public static String replaceCharacter(String word, int position) {

        String modified = "";

        for (int i = 0; i < word.length(); i++) {

            if (i == position) {
                modified += "*";
            }
            else {
                modified += word.charAt(i);
            }
        }

        return modified;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String word = input.nextLine();

        for (int position = 0; position < word.length(); position++) {

            System.out.println(replaceCharacter(word, position));
        }

        input.close();
    }


}