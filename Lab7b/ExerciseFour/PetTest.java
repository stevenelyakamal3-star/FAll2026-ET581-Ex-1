

public class PetTest {
    public static void main(String[] args){
        Puppy[] puppies = {
            new Puppy("Max", 500, "beagle", 4),
            new Puppy("Bella", 700, "poodle", 5),
            new Puppy ("Coco", 450, "pug", 3),
            new Puppy("Rocky", 600, "husky", 6)
        };
        Puppy expensive = findMostExpensive(puppies);
        System.out.println("Most Expensive Puppy");
        System.out.println("Name: " + expensive.getName());
        System.out.println("Price: " + expensive.getPrice());
        System.out.println("Breed: " + expensive.getBreed());
        System.out.println("Age: " + expensive.getAgeInMonths() + " months");
    }
    public static Puppy findMostExpensive(Puppy[] puppies){
        Puppy expensive = puppies[0];
        for(int i = 1; i<puppies.length; i++){
            Puppy p = puppies[i];
            if (p.getPrice()> expensive.getPrice()){
                expensive = p;
            }
        }
      return expensive;
    }
}
