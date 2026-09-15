public class BreakContinueTest{
    public static void main(String []args){
        int i = 0; //init
        while(i<10){ //condition checking

            System.out.println(i);//repeat statement
            if(i ==5){

                break;
            }
            i++; //update statement
        }
        //when i ==5 exit body and come to here
        System.out.println("This is the end of the program.");
         while(i<10){ //condition checking
           
            if(i ==5){

                continue;
            }

             System.out.println(i);//repeat statement
            
            
            i++; //update statement
        }
        

    }

}