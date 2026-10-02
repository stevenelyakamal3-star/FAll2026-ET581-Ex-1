public class ExerciseFour{
    
    public static int largestnumber(int[] array){
    int largest = array[0];




    for (int i = 0; i<array.length; i++){

        if (array[i]> largest){
            largest = array[i];
        }
    }

    return largest;
}


    
    
    
    
    
    
    
    
    
    
    
    
    public static void main(String[] args){

        int numbers[] = {3, 8, 2, 10, 5};
        int max = largestnumber(numbers);
        System.out.println(max);




    }
}