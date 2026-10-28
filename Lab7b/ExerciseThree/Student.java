

public class Student {
    private String name;
    private School school;
    public Student(String name, School school){
        this.name = name;
        this.school = school;
    }
    public void displayInfo(){
        System.out.println("Name: " + name);
        System.out.println("School: " + school.getSchoolName());
        System.out.println("Adress: " + school.getAddress());
    }
    public String getName(){
        return name;
    }
    public School getSchool(){
        return school;
    }
    
}
