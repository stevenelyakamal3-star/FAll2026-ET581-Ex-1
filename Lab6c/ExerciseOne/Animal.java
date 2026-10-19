public class Animal{
    String name;
    String type;
    int age;
    double weight;
    static String zooname = "Wildlife zoo";
    static int count = 0;

    Animal(){
        this("Unknown", "Unknown", 0, 0.0);
        System.out.println("Animal(String name, String type, int age, double weight)");
    }
    Animal(String name, String type, int age, double weight){
        this.name = name;
        this.type = type;
        this.age = age;
        this.weight = weight;
        count++;

    }
    Animal(String name, int age){
        this.name = name;
        this.age = age;
    }
    Animal(String name){
        this.name = name;
        System.out.println("Animal Constructor");
        
    
    
    }
    
    void displayinfo(){
        System.out.println(this.name + ", " + this.type + ", " + this.age + ", " + this.weight);
        System.out.println(this.name + ", " + this.age);
        System.out.println(this.name + ", " + zooname);
        System.out.println(this.name);
    }
    public static void displaycount(){
        System.out.println("There are " + count + " Animals");
    }
    public static void main(String[] args){
        Animal a1 = new Animal();
        Animal a2 = new Animal("Lion", "Mammal", 5, 190.5);
        Animal a3 = new Animal("Tiger", 4);
        Animal a4 = new Animal("Eagle");

        a1.displayinfo();
        a2.displayinfo();
        a3.displayinfo();
        a4.displayinfo();
        Animal.displaycount();
    }
    {

        System.out.println("Animal initialization block");   
    }
}