


import java.util.Scanner;



public class ExerciseSix {
    public static void main(String[] args){
        int[] numbers = {2, 4, 6, 8, 10};

        System.out.println("Enter a number: ");
        Scanner input = new Scanner(System.in);
        int num;
        num = input.nextInt();
        boolean found = false;
        for(int i = 0; i<numbers.length; i++){
            if(num == numbers[i]){
                System.out.println("Number found at index "+ i);
                found = true;

            }
       
        }
         if (found == false){
            System.out.println("Number not found.");
            }

            input.close();


    }
    
}
