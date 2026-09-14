

import java.util.Scanner;


public class ExerciseTwo{


    public static void main(String []args){
        System.out.println("Enter first string: ");
        Scanner input = new Scanner(System.in);
        str wordone;
        wordone = input.nextstr();
        System.out.println("Enter second string: ");
        str wordtwo;
        wordtwo = input.nextstr();

        System.out.println(wordone.equals(wordtwo));
        input.close();








    }
}