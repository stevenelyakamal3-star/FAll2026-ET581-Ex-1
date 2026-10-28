

public class Animal {
    private String name;
    Animal(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
     void makeSound(){
        System.out.println("Animal makes a sound");
    }
}
