

public class AnimalsTen {
    String name;
    
    AnimalsTen(String name){
        this.name = name;

    }
    class Sound{
        void makeSound(){
            System.out.println(name +" makes a sound.");

        }
    }
    
    public static void main(String[] args) {
        AnimalsTen a1 = new AnimalsTen("Lion");

        AnimalsTen.Sound Sound = a1.new Sound();

        Sound.makeSound();
    }
}

