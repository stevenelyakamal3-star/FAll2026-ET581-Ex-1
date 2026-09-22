


import java.util.Scanner;



public class ExerciseThree{
    public static void main(String[] args){

        System.out.println("Enter a string: ");
        Scanner input = new Scanner(System.in);
        String word;
        word = input.nextLine();
        
        int count = 0;
        
        for (int index = 0; index<word.length(); index++){
            if (word.charAt(index) == 'a'){

                count++;



            }
        }
        System.out.println("Number of a: " + count);

        input.close();

    }
}