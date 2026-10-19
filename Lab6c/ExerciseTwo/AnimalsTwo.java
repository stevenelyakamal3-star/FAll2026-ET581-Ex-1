public class AnimalsTwo {
    String name;
    int age;
    AnimalsTwo(String name, int age){
        this.name = name;
        this.age= age;
    }
    void displayinfo(){
        System.out.println(this.name +", " + this.age);
    }
    public static void main(String[] args){
        AnimalsTwo a1 = new AnimalsTwo("Tiger", 4);
        a1.displayinfo();
        new AnimalsTwo("Elephant", 10).displayinfo();
    }
    
}
