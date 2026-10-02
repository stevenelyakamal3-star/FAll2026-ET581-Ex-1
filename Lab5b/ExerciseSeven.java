public class ExerciseSeven {
   
   static int sum(int[][] arr){
        int sum = 0;
    for (int i = 0; i<arr.length; i++){

        for (int c = 0; c<arr.length; c++){
            sum = sum + arr[i][c];


        }
    }    
    return sum;

   }
   
   
   
   
   
   
    public static void main(String[] args){
        int[][] numbers = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println("Sum: " + sum(numbers));
    }
    
}
