package edu.school.visitors;
import edu.school.SchoolRecord;
public class VisitorsTest {
    public static void main(String[] args){
        SchoolRecord record = new SchoolRecord();
        System.out.println(record.schoolname);
        //System.out.println(record.tuition);
        //System.out.println(record.studentname);
        
    }
    //1. line 7 and 8 have errors 
    //2. line 7 fails because tuition cannot be accessed from this class it is a private variable that can be accessed from within its own class which is SchoolRecords and student name cannot be accessed by this class because the class that we are printing student name in(VisitorsTest) has a different package name(edu.school.visitors) than the other class(SchoolRecord) that the variable studentname is declared in which its package name is (edu.school)in order for no error to happen for student name when printing out that variable output the package names within the class that the default variable is declared in needs to be the same as the one that we are printing it out in.
}   
