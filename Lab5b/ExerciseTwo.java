






public class ExerciseTwo{
    public static void main(String[] args){

        int [][] array = {
            {12, 5, 8},
            {20, 3, 15},
            {7, 25, 10}
        };

        for (int i = 0; i<array.length; i++){
            for (int j = 0; j<array.length-1; j++){

                int a = array[i][j];
                int b = array[i+1][j+1];




                if(a>b){
                    int temp = array[i][j];
                    array[i][j] = array[i+1][j+1];
                    array[i+1][j+1] = temp;
                }
                
            }
            System.out.println("Largest: " + array[i+1][j+1]);
        } 



    }
}