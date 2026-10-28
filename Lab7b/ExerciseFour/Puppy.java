

public class Puppy extends Dog {
    private int ageInMonths;
    public Puppy(String name, double price, String breed, int ageInMonths){
        super(name, price, breed);
        this.ageInMonths = ageInMonths;
    }
    public int getAgeInMonths(){
        return ageInMonths;
    }


}
