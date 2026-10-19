

public class AnimalsFour {
   
  
   
   
    {
        System.out.println("Animal initialization block");

   
    }
    String name;
    
    AnimalsFour(String name){
        this.name = name;
        System.out.println("Animal Constructor");
    }
    void displayinfo(){
        System.out.println(this.name);

       
    }
     public static void main(String[] args){
        AnimalsFour a1 = new AnimalsFour("Lion");
        AnimalsFour a2 = new AnimalsFour("Tiger");
        AnimalsFour a3 = new AnimalsFour("Eagle");
        a1.displayinfo();
        a2.displayinfo();
        a3.displayinfo();
        //the initialization block executes three times.
     }
}
