public class WhileLoopTest{
    public static void main(String []args){

        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);
        System.out.println(5);
        // while loop
        int n = 1;//init
        while (n<=4){ // checking condition
            //repeating job inside the body
            System.out.println(n);
            n++; //update

            //when n == 5 while end while loop and comes to here
            System.out.println(5);
            System.out.println(4);
            System.out.println(3);
            System.out.println(2);
            System.out.println(1);
            //
            //1. init
            //2. condition checking
            //3. update condition value
            int m = 5; // initial value is 5
            while(m>=1){
                System.out.println(m);
                m=m-1; //m--1
            }
            // exit loop
            String str = "hello world";
            System.out.println(str);
            System.out.println("String length is: " + str.length());
            System.out.println(str.charAt(1));
            System.out.println(str.charAt(2));//until end of the string
            //while loop
            int index = 0; //init statement
           
            System.out.println("debug line 39" + index + str.length());
           
            while(index <= str.length()){
                // update statement
                System.out.println("debug line 39" + index + str.length());
                System.out.println(str.charAt(index));
                
                
                index ++; //update statement
                

            }
        
        
        }

    }
}