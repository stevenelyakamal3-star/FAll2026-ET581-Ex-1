public class ExerciseSeven {



    public static void main(String[] args){
        int[] numbers = {1, 2, 2, 3, 4, 4, 5};
        System.out.print(numbers[0] + " ");
        for (int i =1; i< numbers.length; i++){
            if (numbers[i]!= numbers[i-1]){
                System.out.print(numbers[i] + " ");
            }
        }
        System.out.println();

    }
    
}
