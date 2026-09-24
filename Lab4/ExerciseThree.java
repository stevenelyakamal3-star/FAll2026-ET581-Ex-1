public class ExerciseThree{
     public static void main(String[] args) {

        int i = 1;

        while (i <= 5) {

            int number = i * 10;

            System.out.println(number);

            i++;

        }

        

    }

//answer question one: This program will not compile.
//answer question two: the print line after the loop is causing the error number is being printed outside of the loop which means its outside of its scope of where it is being declared and number is being declared inside the loop.
//answer question three: the error is ocurring because the variable number is being used outside of the loop which means its outside of the scope where the variable number is being declared in. 
//answer question four: the variable number is being declared inside the while loop while (i<= 5) which is the scope of the variable.
//answer question five: the way to fix the program is to eliminate the extra print statement outside of the loop and the program should compile successfully







}