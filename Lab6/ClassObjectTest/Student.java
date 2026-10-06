

public class Student{
    String name;// first member
    int age; // second member




    Student(){// constructor 1

    }
    Student(String n){// constructor 2

    }
    Student(String n, int a){// constructor 3
        name = n;
        age = a;

    }
    void display(){// third member
        System.out.println(name + " " + age);
    }
    
}
