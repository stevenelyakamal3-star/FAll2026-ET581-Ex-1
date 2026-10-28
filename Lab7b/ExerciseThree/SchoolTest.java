

public class SchoolTest {
    public static void main(String[] args){
        School school = new School("Central School","New York");


        Student[] students = {
            new Student("Alice", school),
            new Student("Bob", school),
            new Student("Carol", school)
        };
        for (Student student: students){
            student.displayInfo();
            System.out.println();
        }

    }
        
}
