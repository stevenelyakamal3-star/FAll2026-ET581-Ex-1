

public class Animal {
    int age;
    String name;
    Animal(int age, String name){
        this.name=name;
        this.age = age;

    }   
    public String toString(){
        return this.age + " " + this.name;
    }
    public static void main(String[] args){
        Animal a = new Animal(1, "animal");
        Dog d = new Dog(2, "dog");
        Cat c = new Cat(3, "cat");
        System.out.println(a);
    }
}
