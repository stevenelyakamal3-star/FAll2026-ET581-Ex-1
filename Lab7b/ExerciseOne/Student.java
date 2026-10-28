public class Student extends Person{
    private String studentID;

    Student(String name, int age, String studentID){
        super(name, age);
    }
    public String getStudentID(){
        return studentID;
    }

}
