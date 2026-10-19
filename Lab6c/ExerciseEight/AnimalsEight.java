

public class AnimalsEight {
    String name;
    int age;
    AnimalsEight(String name, int age){
        this.name = name;
        this.age = age;
        
    }   

    public static AnimalsEight[] filterAnimals(AnimalsEight[] animals){
        
        int count = 0;
        for (int i = 0; i <animals.length; i++){
            if (animals[i].age>=5 ){
                count++;
            }
            

         }
        AnimalsEight[] result = new AnimalsEight[count];
         int index = 0;
         for (int i = 0; i <animals.length; i++){
            if (animals[i].age>=5){
                result[index]= animals[i];
                index++;
            }
         }
        return result;
        }
        void displayinfo(){
            System.out.println(this.name + ", " + this.age);
        }
    
    public static void main(String[] args) {
        AnimalsEight[] animals = {
            new AnimalsEight("Lion", 5),
            new AnimalsEight("Eagle", 3),
            new AnimalsEight("Turtle", 20),
            new AnimalsEight("Dolphin", 8),
            new AnimalsEight("Parrot", 4)
        };

        AnimalsEight[] result = AnimalsEight.filterAnimals(animals);

        for (int i = 0; i < result.length; i++) {
            result[i].displayinfo();
        }
    }
}

