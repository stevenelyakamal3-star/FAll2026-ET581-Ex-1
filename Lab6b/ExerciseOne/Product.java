

public class Product {
    private String name;
    private double price;
    static int count;
    public Product(String name){
        this.name = name;
            count++;

    }
     public Product(String name, double price){
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
    public void setName(String name){
        this.name = name;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public String toString(){
        return "Name: " + this.name + " , " + "Price: " + this.price;
    }
    public boolean equals(Product p){
        return name.equals(p.name) && price== p.price;
            
    }
    public int compareTo(Product p){
        return (int)(this.price - p.price);
    }
    
    
}
