

public class School {
    private String schoolName;
    private String Address;
    public School(String schoolName, String Address){
        this.schoolName = schoolName;
        this.Address = Address;
    }
    public String getSchoolName(){
        return schoolName;
    }        
    public String getAddress(){
        return Address;
    }
}
