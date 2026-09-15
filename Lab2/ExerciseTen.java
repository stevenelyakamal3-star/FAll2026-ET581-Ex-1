public class ExerciseTen{
    public static void main(String []args){
        String words = "one two one two one";
        int position;
        position = words.indexOf("one", 1);
        int positiontwo = words.indexOf("one", 8);
        System.out.println("Second 'one' starts at index: " + positiontwo);

    }
}