public class ExerciseThree{
    public static void main(String[] args){
        String input = "Java";
        System.out.println("Input: " + input);
        int len; 
        len = input.length();
        int index = 3;
        System.out.print("Output: "); //i did not use println on either of my print statements because println means i am printing text on separate lines in the case of loops where as print just means print whatever text there is on the same exact line not on a different line which actually works well for this particular problem concerning loops

        while (index>=0){
             

            System.out.print(input.charAt(index));
            index = index - 1;
            
            
            
            





        }
        System.out.println();        


        
    }
}