

public class Dog extends Animal {

  Dog(){
    super(1,"unknown");
    System.out.println("Dog() is called.");
  }  

 void eats(){//overriding super class eats method

        System.out.print("Dog Eats");

    }

}

