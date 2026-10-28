

public class AnimalTest {
    public static void main(String[] args){
        Animal[] animals = {
            new Dog("Buddy"),
            new Cat("Luna"),
            new Dog("Max")
        };
        for (Animal animal:animals){
            System.out.print(animal.getName() + ": ");
            animal.makeSound();
        }
    }
}
