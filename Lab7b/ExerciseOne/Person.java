public class Person {
    private String name;
    private int age;
    Person(String name, int age){
        this.name = name;
        this.age= age;

    }   
    public String getName(){
        return name;
    }   
    public int getAge(){
        return age;
    }
    public void setName(String n){
        name = n;
    }
    public void setAge(int a){
        age = a;
    }
}
