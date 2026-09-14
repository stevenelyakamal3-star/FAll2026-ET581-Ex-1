import java.util.Scanner;


public class ExerciseFour{
    public static void main(String []args){
        System.out.println("Enter a day number: ");
        Scanner input = new Scanner(System.in);
        int day;
        day = input.nextInt();
        boolean result = (day == 1) || (day == 3) || (day == 5);
        System.out.println(result);
        
        input.close();




    }
}