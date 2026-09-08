public class StringMethodTest{
    public static void main(String []args){
        // type name = init value;
        String name = "Li";
        char c = name.charAt(0); // var.method();
        System.out.println(c);
        //same thing without var declaration
        c = "Li".charAt(1);
        System.out.println(c);
        int x = "first".compareTo("second"); // return int value
        System.out.println(x);
    }
}