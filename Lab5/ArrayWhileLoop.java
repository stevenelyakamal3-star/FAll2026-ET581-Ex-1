
import java.util.Arrays;
import java.util.Scanner;


public class ArrayWhileLoop {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int size;
        size = input.nextInt();
        // create an array of the size
        int[] array = new int[size];
        for(int i = 0; i<array.length; i++){
            array[i] = 2;

        }
        System.out.println(Arrays.toString(array));
        //for each loop
        for(int element : array){
            System.out.println(element);
        }
    }
    
}
