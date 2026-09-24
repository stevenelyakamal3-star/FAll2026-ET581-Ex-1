public class FunctionTest{ // class body start here
// method 1
    public static void method1(){//method body starts here
        System.out.println("method1 is called.");




    }
    public static void main(String[] args){
        //call method1
        method1(); //empty params
        int x = 1;
        double y = .25;
        method2(x, y);
        
    }
    // method
    // your method can be anywhere inside class body.
    //class body ends here.
    //method2
    public static void method2( int a, double b){
        System.out.println(a+b);
        System.out.println("method2 is called.");
    }
}
// your method can be anywhere inside the class body