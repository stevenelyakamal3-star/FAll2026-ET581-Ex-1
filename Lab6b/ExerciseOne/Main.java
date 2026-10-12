

public class Main {
    static void sortProducts(Product[] products){
        for (int i = 0; i <products.length-1; i++){
            for(int j = 0; j< products.length -1 -i; j++){
                if(products[j].compareTo(products[j+1])>0){
                
                    Product temp = products[j];
                    products[j]= products[j+1];
                    products[j+1]= temp;
                }
            }
        }
    }
    
    static void printProducts(Product[] products){
        for (int i = 0; i<products.length; i++){
            System.out.println(products[i]);
        }

    }
    
    
    
    
    public static void main(String[] args){

        
        Product p1 = new Product("Apple",1.25);
        Product p2 = new Product("Apple", 1.25);
        Product p3 = new Product("Orange", 1.25);
        System.out.println("Product info: ");
        System.out.println(p1);
        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p3));
        System.out.println(Product.count);
        Product p4 = new Product("Mango");
        p4.setName("Bannana");
        p4.setPrice(1.25);
        System.out.println(p4.getName());
        System.out.println(p4.getPrice());
        Product p5 = new Product("Softner", 10.00); 
        Product p6 = new Product("Sweetner", 15.00);
        System.out.println(p5.compareTo(p6));
        System.out.println(p6.compareTo(p5));
        Product p7 = new Product("Pretzels", 2.00);
        Product p8 = new Product("Chips", 1.25);
        Product[] products = new Product[5];

        products[0] = new Product("Toothpaste", 9.98);
        products[1] = new Product("Sweet potato", 10.00);
        products[2] = new Product("Vegetable soup", 16.99);
        products[3] = new Product("EggPlant parmajian", 14.99);
        products[4] = new Product("Pizza" ,20.00);
        
        sortProducts(products);
        printProducts(products);
        
    }

    
}
