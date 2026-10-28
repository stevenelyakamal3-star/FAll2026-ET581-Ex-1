package edu.school;

public class SchoolTest {
    public static void main(String[] args){
        SchoolRecord record = new SchoolRecord();
        System.out.println(record.schoolname);
        //System.out.println(record.tuition);
        System.out.println(record.studentname);
        //1. SchoolTest can access schoolname because school name is declared as a public variable in the class SchoolRecords which indicates that public variables can be accessed from any class
        //2. SchoolTest can access studentname because studentname is a default variable and those variables can also be accessed by different classes in the same package and SchoolRecords is in the same package as SchoolTest thats why it can access it.
        //3. Tuition is a private variable and can only be accessed within the class that it has been declared in which is SchoolRecords regardless of whether both SchoolRecords and SchoolTest have the same packages.    
    }
    
}
