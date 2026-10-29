

public class Cat extends Animal {
    Cat(int age, String name){
        super(age, name);
        super.age = age +1;
        super.name = name + "-";
        //this.name
        this.name = name;
        this.age = age;
        System.out.println("this.age " + this.age);
        System.out.println("super.age " +super.age);
    }
}
