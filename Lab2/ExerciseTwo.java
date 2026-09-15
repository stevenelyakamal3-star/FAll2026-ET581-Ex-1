

import java.util.Scanner;


public class ExerciseTwo{


    public static void main(String []args){
        System.out.println("Enter first string: ");
        Scanner input = new Scanner(System.in);
        String wordone;
        wordone = input.nextLine();
        System.out.println("Enter second string: ");
        String wordtwo;
        wordtwo = input.nextLine();

        System.out.println(wordone.equals(wordtwo));
        input.close();








    }
}