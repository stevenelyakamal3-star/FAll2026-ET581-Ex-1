


import java.util.Random;


public class RandomMathTest{

    public static void main(String[] args){

        double randomNumber = Math.random();//0.0 to 1.0 not include 1.0
        System.out.println(randomNumber);
        // print number from 0 to 9
        int number = (int)(randomNumber * 101);
        System.out.println(number);
        // max and min
        System.out.println(Math.max(204,203));
        System.out.println(Math.min(203,204));
        System.out.println(Math.pow(2,4));

        //Random class

        Random random = new Random();
        System.out.println("Random double: " + random.nextDouble());
        





    }


}