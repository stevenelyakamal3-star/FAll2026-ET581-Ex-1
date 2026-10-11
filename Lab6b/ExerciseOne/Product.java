

public class Product {
    private String name;
    private double price;
    Product(String name){
        this.name = name;

    }
    Product(String name, double price){
        this.name = name;
        this.price = price;

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
        if ((name == p.name) && (price == p.price)){
            return true;
        }
        else{
            return false;
        }
    }
    public int compareTo(Product p){
        return (int)(this.price - p.price);
    }
    static int count(){
        
    }
    
}
