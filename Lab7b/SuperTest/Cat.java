

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
    public static void main(String[] args){
        //object test
        Object o = new Object();
        System.out.println(o.toString());
        System.out.println(o.hashCode());
        System.out.println(o.getClass());
        Animal a = new Animal(1, "animal"); //any class extends object
        System.out.println(a.toString());
        System.out.println(a.hashCode());
        System.out.println(a.getClass());
    }
}
