public class ExerciseThree {
    
    public static int sum(int[] array){
        int sum = 0;


        for (int i = 0; i<array.length; i++){

            sum = sum + array[i];





        }


       return sum; 


    }
    
    
    
    
    public static void main(String[] args){

       int numbers[] = {1, 4, 5, 6, 7};

        
        
        
        
        System.out.println(sum(numbers));


    }
    
}
