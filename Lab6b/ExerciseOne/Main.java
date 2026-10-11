

public class Main {
    public static void main(String[] args){

        
        Product p1 = new Product("Apple",12.43);
        Product p2 = new Product("Apple", 12.43);
        Product p3 = new Product("Apples", 12.43);
        Product p4 = new Product("Transformers", 10.00);
        Product p5 = new Product("Softner", 15.00); 
        Product p6 = new Product("Sweetner", 1.50);
        Product p7 = new Product("Pretzels", 2.00);
        Product p8 = new Product("Chips", 1.25);
        System.out.println("Product info: ");
        System.out.println(p1);
        System.out.println(p2);
        p3.setName("orange");
        p3.setPrice(14.43);
        System.out.println(p3.getName());
        System.out.println(p3.getPrice());
        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p3));
        System.out.println(p4.compareTo(p5));
        System.out.println(p5.compareTo(p4));
        System.out.println(Product.count);
        Product[] products = new Product[5];

        products[0] = new Product("Toothpaste", 9.98);
        products[1] = new Product("Sweet potato", 10.00);
        products[2] = new Product("Vegetable soup", 12.99);
        products[3] = new Product("EggPlant parmajian", 14.99);
        products[4] = new Product("Pizza" ,20.00);
        
        for (int i = 0; i<products.length; i++){
            System.out.println(products[i]);
        }
        
    }

    
}
