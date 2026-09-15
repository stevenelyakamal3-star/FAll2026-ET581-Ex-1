import java.util.Scanner;


public class ExerciseTwelve{
    public static void main(String []args){
        System.out.println("Enter first word: ");
        Scanner input = new Scanner(System.in);
        String word;
        word = input.nextLine();
        System.out.println("Enter second word: ");
        String wordtwo;
        wordtwo = input.nextLine();
        int wordcomparison;
        wordcomparison= word.compareTo(wordtwo);
        System.out.println(word);
    }
}