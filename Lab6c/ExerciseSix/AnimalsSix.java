

public class AnimalsSix {
    String name;
    String type;
    int age;
    AnimalsSix(String name, String type, int age){
        this.name = name;
        this.type = type;
        this.age = age;

    
    }
    void displayinfo(){
        System.out.println(this.name + ", " + this.type + ", " + this.age);
    }    
    public static void main(String[] args){
        AnimalsSix[] animals = {
              new AnimalsSix("Lion", "mammal", 5),
              new AnimalsSix("Eagle", "Bird",3),
              new AnimalsSix("Turtle", "Reptile", 20),
              new AnimalsSix("Dolphin", "Mammal", 8),
              new AnimalsSix("Parrot", "Bird", 4)
        };

        for (int i = 0; i<animals.length; i++){
            animals[i].displayinfo();
        }
    }
}
