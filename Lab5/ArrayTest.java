import java.util.Arrays;



public class ArrayTest{
    public static void main(String[] args){
       // declare an array
       int[] intarray;
       double[] doublearray;
       String[] stringarray;
       // int
       intarray = new int[5]; // intarray will look like this [0, 0, 0, 0, 0]
       doublearray = new double[3];
       stringarray = new String[6];
       System.out.println(intarray);
       System.out.println(doublearray);
       System.out.println(stringarray);
       System.out.println(Arrays.toString(intarray));
       System.out.println(Arrays.toString(doublearray));
       System.out.println(Arrays.toString(stringarray));
       for (int i =0; i<3; i++){

            System.out.println(intarray[i]);
       }
       // second way to create array
       
       
       int[] intarray2 = {1, 2, 3, 4};
       double[] doublearray2 = {0, 1, 0, 2};
       System.out.println(Arrays.toString(doublearray2));
       System.out.println(Arrays.toString(intarray2));
       //third way

       int[] intarray3 = new int[] {1, 2, 4};
       int size = 10;
       int[] intarray4 = new int[size];
       System.out.println(Arrays.toString(intarray3));
       System.out.println(Arrays.toString(intarray4));
       



    }
}