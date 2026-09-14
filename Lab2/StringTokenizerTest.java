
import java.util.StringTokenizer;


public class StringTokenizerTest{
    public static void main(String []args){

        String sentance = "apple orange mango";
        StringTokenizer st1; // declare a var which type is StringTokenizer
        st1 = new StringTokenizer(sentance);
        
        String first = st1.nextToken();
        String second = st1.nextToken();
        String third = st1.nextToken();
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        String sentance2 = "apple, orange, mango";
        StringTokenizer st2  = new StringTokenizer(sentance2, ",");
        first = st2.nextToken();
        second = st2.nextToken();
        third = st2.nextToken();
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);





    }
}