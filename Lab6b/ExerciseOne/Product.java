

public class Product {
    private String name;
    private double price;
    static int count;
    Product(String name){
        this.name = name;
            count++;

    }
    Product(String name, double price){
        this.name = name;
        this.price = price;
        count++;
    }
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    public void setName(String n){
        name = n;
    }
    public void setPrice(double p){
        price = p;
    }
    public String toString(){
        return "Name: " + this.name + " , " + "Price: " + this.price;
    }
    public boolean equals(Product p){
        if ((name.equals(p.name)) && (price== (p.price))){
            return true;
        }
        else{
            return false;
        }
    }
    public int compareTo(Product p){
        return (int)(this.price - p.price);
    }
    
    
}
