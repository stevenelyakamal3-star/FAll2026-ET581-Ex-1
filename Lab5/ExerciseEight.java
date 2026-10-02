public class ExerciseEight {
    
    public static boolean isSorted(int[] array){
        for (int i = 1; i<array.length; i++){
            if (array[i]<array[i-1]){
                return false;
            }
        }
    
    return true;
    
    
    }
    public static void main(String[] args){
         int[] numbers = {1, 2, 3, 4};
         System.out.println(isSorted(numbers));
         numbers = new int[] {1, 3, 2, 4};
         System.out.println(isSorted(numbers));



    }
    
}
