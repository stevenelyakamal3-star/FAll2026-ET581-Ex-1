

public class AnimalsFive {
    String name;
    static int count = 0;
    AnimalsFive(String name){
        this.name = name;
        count++;

    }   
    public static void displaycount(){
        System.out.println("The total number of animals created: " + count);
    } 
    public static void main(String[] args){
        AnimalsFive a1 = new AnimalsFive("Lion");
        AnimalsFive a2 = new AnimalsFive("Tiger");
        AnimalsFive a3 = new AnimalsFive("Elephant");
        AnimalsFive a4 = new AnimalsFive("Giraffe");
        AnimalsFive.displaycount();
        //count is shared by all objects because we are printing count under a publically declared method and that means that all objects are shared within the class not just within the method itself where as a private method means that all objects in that specific method are shared not anything outside the method within the class
    }
}
