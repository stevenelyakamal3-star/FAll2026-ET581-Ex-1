
import java.util.Scanner;


public class ExerciseThree{
    public static void main(String[] args){
        System.out.println("Number of rows: ");
        Scanner input = new Scanner(System.in);
        int rows;
        rows = input.nextInt();
        System.out.println("Number of columns: ");
        int columns;
        columns = input.nextInt();
        

        for (int i = 0; i<rows; i++){
            for(int j = 0; j<columns; j++){
                System.out.print(" * ");                


            }
            System.out.println();
        }
    }
}
