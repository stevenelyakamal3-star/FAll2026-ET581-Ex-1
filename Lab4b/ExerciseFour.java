import java.util.Scanner;



public class ExerciseFour {
    public static void main(String[] args){

        System.out.println("Enter a string: ");
        Scanner input =  new Scanner(System.in);
        String letter;
        letter = input.nextLine();
        System.out.println("Enter number of times: ");
        int numberoftimes;
        numberoftimes = input.nextInt();
        
        for(int i = 0; i<letter.length(); i++){
            for (int j = 0; j<numberoftimes; j++){
                System.out.print(letter.charAt(i));
            }
            System.out.println();
        }



    }
    
}
