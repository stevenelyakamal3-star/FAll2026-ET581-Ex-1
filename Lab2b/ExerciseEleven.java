

import java.util.StringTokenizer;



public class ExerciseEleven{
    public static void main(String []args){

        String text = "Java is easy to learn. ";
        StringTokenizer st1 = new StringTokenizer(text);
        String first = st1.nextToken();
        String second = st1.nextToken();
        String third = st1.nextToken();
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);        


    }
}