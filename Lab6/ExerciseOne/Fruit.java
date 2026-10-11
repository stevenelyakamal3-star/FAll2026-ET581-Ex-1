public class Fruit {
String name;
String color;
double weight;
Fruit(String n, String c, double w){
    this.name = n;
    this.color = c;
    this.weight = w;
    }
public void showinfo(){
    System.out.println("Name: " + this.name + "\n" + "Color: " + this.color + "\n" + "Weight: " + this.weight + "\n");
    }
}
