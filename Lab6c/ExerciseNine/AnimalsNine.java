

public class AnimalsNine {
    String name;
    static String zooName = "Wildlife zoo";
    AnimalsNine(String name){
        this.name = name;
        
    }
    static class ZooInfo{
        void displayZooName(){
            System.out.println(zooName);


        }


    }
    public static void main(String[] args) {
        AnimalsNine.ZooInfo info = new AnimalsNine.ZooInfo();

        info.displayZooName();
    }

    
}

    