public class Main {
    public static void main(String[] args){
        
        Fruit fruit1 = new Fruit("Apple", "red", .5);
        Fruit fruit2 = new Fruit("Mango", "Yellow", .7);
        Fruit fruit3 = new Fruit("Orange", "Orange", .4);
        Fruit fruit4 = new Fruit("Apple", "Green", .6);
        Fruit fruit5 = new Fruit("Mango", "Green", .8);
        Fruit[] fruits = {fruit1,
                          fruit2,
                          fruit3,
                          fruit4,
                          fruit5,};
        for(int i = 0; i <fruits.length; i++){
            fruits[i].showinfo();
        }                  
    } 
    
}
