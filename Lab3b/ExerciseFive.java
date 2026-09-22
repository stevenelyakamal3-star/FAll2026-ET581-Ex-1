





import java.util.Scanner;


public class ExerciseFive{
    public static void main(String[] args){

        System.out.println("Input: ");
        Scanner input = new Scanner(System.in);
        String word;
        word = input.nextLine();
        int count = 0;
        boolean Symmetric = true;


        for (int i =0; i<word.length()/2; i++){
            
            if (word.charAt(i)!=word.charAt(word.length()-1-i)){
                Symmetric = false;
                    break;



            }
        
            
            
            
            
            
            




        }
        if(Symmetric){
            System.out.println("Output: Symmetric.");
        }

        else{
            System.out.println("Output: Not Symmetric.");
        }

        input.close();








    }
}