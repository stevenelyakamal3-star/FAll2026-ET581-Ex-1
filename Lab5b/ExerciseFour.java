
import java.util.Scanner;


public class ExerciseFour {
    public static void main(String[] args){
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Enter column number: ");
        Scanner input = new Scanner(System.in);
        int column;
        column = input.nextInt();

        for(int r = 0; r<arr.length; r++){
            System.out.println(arr[r][column]);

        }
        
        input.close();
    }
    
}
