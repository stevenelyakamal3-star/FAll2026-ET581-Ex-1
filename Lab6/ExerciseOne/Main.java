public class Main {

    static void printFruit(Fruit fruit) {

        fruit.showinfo();

    }
    static void compareWeight(Fruit fruit1, Fruit fruit2){
        if (fruit2.weight > fruit1.weight){
            System.out.println(fruit2.name +" is heavier than " + fruit1.name);
        }



    }
    static Fruit[] getApples(Fruit[] fruits){
        int count = 0;
        
        for(int i = 0; i<fruits.length; i++){
            if (fruits[i].name.equals("Apple")){
                count++;


            }
        }
        Fruit[] apples = new Fruit[count];
        int j = 0;
        for (int i = 0; i<fruits.length; i++){
            if (fruits[i].name.equals("Apple")){
                apples[j] = fruits[i]; 
                j++;
            }

        }
        return apples;


    }


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
        printFruit(fruit1);
        printFruit(fruit2);
        printFruit(fruit3);
        printFruit(fruit4);
        printFruit(fruit5);
        compareWeight(fruit1, fruit2);
        Fruit[] applearray = getApples(fruits);
        for (int i = 0; i <applearray.length; i++){
            applearray[i].showinfo();

        }
    }
     
    
}
