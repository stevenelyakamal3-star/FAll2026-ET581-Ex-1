public class StudentTest {
    
   
    
    
    public static void main(String[] args){
        Student[] students = {
            new Student("Alice", 20, "S101"),
            new Student("Bob", 18, "S102"),
            new Student("Carol", 23, "S103"),
            new Student("David", 21, "S104")
        };
        Student oldest = findOldest(students);
        System.out.println("Oldest student: " + oldest.getName());
        System.out.println("Age: " + oldest.getAge());
        System.out.println("Student ID: " + oldest.getStudentID());

    }

     public static Student findOldest(Student[] students){
        Student oldest = students[0];
        for (int i = 1; i <students.length; i++){
            Student s = students[i];
            if(s.getAge() > oldest.getAge()){
                oldest = s;
            }
        }
        return oldest;


    }
    
    
}
