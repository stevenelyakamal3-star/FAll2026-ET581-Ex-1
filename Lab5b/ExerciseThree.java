
import java.util.Scanner;



public class ExerciseThree {
    public static void main(String[] args){
        int[][] arr = {
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}
                    };
                
    
        System.out.println("Enter a row number: ");
        Scanner input = new Scanner(System.in);
        int row;
        row = input.nextInt();

        for (int c = 0; c<arr.length; c++){
            System.out.print(arr[row][c] + " ");


        }
        System.out.println();
        input.close();




    
    
    
    
    
    
        }
    




}
