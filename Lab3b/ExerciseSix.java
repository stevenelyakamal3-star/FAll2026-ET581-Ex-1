
import java.util.Scanner;


public class ExerciseSix{
    public static void main(String[] args){

        System.out.println("Enter a word: ");
        Scanner input = new Scanner(System.in);
        String word;
        word = input.nextLine();
        boolean onlylowercase = true;
        boolean increasing = true;

        for(int i = 0; i<word.length(); i++){

            if(!Character.isLowerCase(word.charAt(i))){

             onlylowercase = false;   


            }
            if (i<word.length()-1){
                if (word.charAt(i)>=word.charAt(i+1)){
                    increasing = false;



                }
            }
            



        }
        if(!onlylowercase){
            System.out.println("Invalid.");
        }
        else if(increasing){
            System.out.println("Increasing order.");
        }
        else{
            System.out.println("Not increasing order.");
        }

    }
}