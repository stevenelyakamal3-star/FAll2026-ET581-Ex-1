
import java.util.Scanner;



public class ExerciseThree{

    public static void main(String []args){
        System.out.println("Enter age: ");
        Scanner input = new Scanner(System.in);
        int age;
        age = input.nextInt();
        boolean equals = age>18 && age<65;
        System.out.println("Eligible: " + equals);

        input.close();


        



    }




}