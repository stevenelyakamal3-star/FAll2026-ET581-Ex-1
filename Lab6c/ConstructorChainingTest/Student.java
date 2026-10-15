public class Student{
    String name;
    int age;
    static {//  instance or non static block
        System.out.println("This is a static block");
    }


    
    
    Student(){
        System.out.println("Student()");


    }
    Student(String name){
        this.name = name;
        System.out.println("Student(String name");



    }
    Student(String name, int age){


        this.name = name;
        this.age = age;
        System.out.println("Student(String name, int age)");
    }

    public static void main(String[] args){

        Student s = new Student("Alice", 18);
        Student s2 = new Student("Bob", 20);
    }
    {//  instance or non static block
        System.out.println("This is a non-static block");
    }





}