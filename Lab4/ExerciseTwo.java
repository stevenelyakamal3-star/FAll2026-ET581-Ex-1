

import java.util.Scanner;



public class ExerciseTwo{


public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your score: ");

        int score = input.nextInt();

        if (score >= 100) {

             String message = "You unlocked a bonus!";

            System.out.println(message);

        }

    input.close();        

    }

//question one answer: no this program will not compile.
//question two answer: the print statement out of the if condition is causing the error.
//question three answer: the variable message exists outside of the scope of the if statement that it was declared in.
//question four answer: the variable message is a string variable declared within the current if condition
//question five answer: all you have to do is take out the extra print statement outside of the scope of the if statement where the variable message is being declared and your program should compile. 




}