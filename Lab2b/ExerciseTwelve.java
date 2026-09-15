

import java.util.StringTokenizer;




public class ExerciseTwelve{
    public static void main(String []args){
        String Data = "apple,banana,orange,grape";
        StringTokenizer st1 = new StringTokenizer(Data, ",");
        String first = st1.nextToken();
        String second = st1.nextToken();
        System.out.println(first);
        System.out.println(second);




    }



}