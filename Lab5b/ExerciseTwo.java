






public class ExerciseTwo{
    public static void main(String[] args){

        int [][] array = {
            {12, 5, 8},
            {20, 3, 15},
            {7, 25, 10}
        };
        int largest = array[0][2];

        for (int i = 0; i<array.length; i++){
            for (int c = 0; c<array.length; c++){


                if (array[i][c]>largest){
                    largest = array[i][c];
                    
                }


            }


        }
        System.out.println("Largest: " + largest);


    }
}