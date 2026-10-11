

public class Main {
    public static void main(String[] args){

        
        Product p1 = new Product("Freshner");
        Product p2 = new Product("Transformers", 12.43);
        Product p3 = new Product("Apples", 13.45);
        System.out.println("Product info: ");
        System.out.println(p1);
        System.out.println(p2);
        p3.setName("orange");
        p3.setPrice(14.43);
        System.out.println(p3.getName());
        System.out.println(p3.getPrice());

        
    }

    
}
