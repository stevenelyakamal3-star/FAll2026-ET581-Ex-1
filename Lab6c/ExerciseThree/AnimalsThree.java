

public class AnimalsThree {
    String name;
    static String Zooname = "Wildlife zoo";
    AnimalsThree(String name){
        this.name = name;

    }   
    void displayinfo(){
        System.out.println(this.name + ", " + Zooname);
    } 
    public static void main(String[] args){
        AnimalsThree a1 = new AnimalsThree("Lion");
        AnimalsThree a2 = new AnimalsThree("Tiger");
        a1.displayinfo();
        a2.displayinfo();
    }
}
