
import java.util.Scanner;


public class ExerciseEight{
    public static void main(String []args){

        System.out.println("Enter grade: ");
        Scanner input = new Scanner(System.in);
        int grade;
        grade = input.nextInt();
        String result = (grade > 60)? "Pass": "Fail";
        System.out.println(result);
        input.close();


    }
}