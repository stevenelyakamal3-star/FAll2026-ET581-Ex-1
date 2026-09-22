

import java.util.Scanner;


public class ExerciseOne{
    public static void main(String []args){

        System.out.println("Enter an integer: ");
        Scanner input = new Scanner(System.in);
        int number;
        number = input.nextInt();
        
        for(int i = 0;i<number; i++){
            System.out.println("Hello");



        }
        input.close();
        

    }
}