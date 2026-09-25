public class NestedLoop{
    public static void PrintRowofHello(){
        for (int j =1; j<=4; j++){
            System.out.println();
        }
    }

public static void main(String[] args){
    //PrintRowofHello();
    //PrintRowofHello();
    //PrintRowofHello();
    //PrintRowofHello();


    //for(int i = 0; i < 5; i++){
        //PrintRowofHello();
    //}
    for (int i=0; i<5; i++){
        for(int j = 1; j<=4; j++){


            System.out.print(" Hello ");
        }
        System.out.println();
    }
}





}