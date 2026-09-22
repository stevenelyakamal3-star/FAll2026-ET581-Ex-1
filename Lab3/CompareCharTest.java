public class CompareCharTest{

    public static void main(String[] args){
        char c ='a';
        System.out.println("Char c value is: " + (int)c);
        System.out.println("Char c value is: " + (int)'a');
        System.out.println("Char c value is: " + (int)'z');
        System.out.println("Char c value is: " + (int)'Z');
        if (c>= 'a' && c<='z'){
            System.out.println("Uppercase");
        }
        else if(c>= 'A' && c<='Z'){
            System.out.println("Uppercase");


        }
        String output = c + "";
        System.out.println(output);
    }
}