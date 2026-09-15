
import java.util.Scanner;




public class ExerciseTen{
    public static void main(String []args){

        System.out.println("Enter first number: ");
        Scanner input = new Scanner(System.in);
        int firstnumber;
        firstnumber = input.nextInt();
        System.out.println("Enter second number: ");
        int secondnumber;
        secondnumber = input.nextInt();
        System.out.println("Enter operator: ");
        char operator;
        operator = input.next().charAt(0);
        int result;
        
        switch(operator){
            case '+':
                result = firstnumber + secondnumber;
                System.out.println("Result: " + result);
                break;

            case '-':
                result = firstnumber - secondnumber;
                System.out.println("Result: " + result);
                break;
            case '*':
                result = firstnumber * secondnumber;
                System.out.println("Result: " + result);
                break;
            case '/':
                result = firstnumber / secondnumber;
                System.out.println("Result: " + result);
                break;

    
           




        }

        input.close();
        
    }
}