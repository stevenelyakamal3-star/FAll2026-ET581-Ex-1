public class ExerciseEight {
    
    static int[][] getLengths(String[][] words){
        int[][]arr = {{3, 5, 3},
                      {6, 4, 8},
                      {2, 6, 4}};

        for(int i = 0; i<words.length; i++){

            for(int j = 0; j<words[i].length; j++){
                arr[i][j] = words[i][j].length();

            }
        }
        return arr;


    }
    
    
    
    
    
    
    public static void main(String[] args){

        String[][] words = {
            {"cat", "apple", "dog"},
            {"banana", "java", "computer"},
            {"hi", "school", "book"}
        };
        int array[][] = getLengths(words);
        for(int i = 0; i<array.length; i++){
            for (int j = 0; j<array[i].length; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }       

}   