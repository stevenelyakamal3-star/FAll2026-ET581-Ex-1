public class ExerciseFive {
    public static int counteven(int[] array){

        int num = 0;

        for(int i = 0; i<array.length; i++){
            if (array[i]%2 == 0){
                num++;
            }
        }
        return num;
    }
    
    
    
    
    
    
    
    
    
    
    
    public static void main(String[] args){
        int[] numbers = {4, 7, 9, 12, 6, 3};
        int count = counteven(numbers);
        System.out.println(count);
    }   
}