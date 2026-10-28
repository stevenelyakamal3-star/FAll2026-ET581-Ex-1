

public class Person {
    private String name;
    private int age;
    
    Person(String name, int age){
        this.name = name;
        this.age = age;

    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String setName(String n){
        name = n;
    }
    public int setAge(int a){
        age = a;

    }
    
}
