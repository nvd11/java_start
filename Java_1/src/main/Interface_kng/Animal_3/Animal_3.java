package Interface_kng.Animal_3;

public class Animal_3{
    public static void f(){
        Farmer fm = new Farmer();
        Snake sn = new Snake();
        Goat gt = new Goat();
        Tiger tg = new Tiger();
        Rabbit rb = new Rabbit();

        fm.feedAnimal(sn,rb);
        fm.feedAnimal(tg,rb);
        //fm.feedAnimal(gt,rb);
    }
}


interface Huntable<T>{
    public void hunt(T o);
}

abstract class Animal{
    public abstract String getName();
    public abstract void move(String destination);
    public abstract void drink();
}

abstract class Mammal extends Animal{

}

abstract class Reptile extends Animal{

}

class Goat extends Mammal{
    private static String name = "Goat";
    public String getName(){
        return this.name;
    }

    public void move(String destination){
        System.out.println("Goat moved to " + destination + ".");
    }

    public void drink(){
        System.out.println("Goat lower it's head and drink.");
    }
}

class Tiger extends Mammal implements Huntable<Animal>{
    private static String name = "Tiger";
    public String getName(){
        return this.name;
    }

    public void move(String destination){
        System.out.println("Goat moved to " + destination + ".");
    }

    public void drink(){
        System.out.println("Goat lower it's head and drink.");
    }

    public void hunt(Animal a){
        System.out.println("Tiger catched " + a.getName() + " and eated it");
    }
}

class Rabbit extends Mammal{
    private static String name = "Rabbit";
    public String getName(){
        return this.name;
    }

    public void move(String destination){
        System.out.println("Rabbit moved to " + destination + ".");
    }

    public void drink(){
        System.out.println("Rabbit put out it's tongue and drink.");
    }
}

class Snake extends Reptile implements Huntable<Animal>{
    private static String name = "Snake";
    public String getName(){
        return this.name;
    }

    public void move(String destination){
        System.out.println("Snake crawled to " + destination + ".");
    } 

    public void drink(){
        System.out.println("Snake dived into water and drink.");
    }

    public void hunt(Animal a){
        System.out.println("Snake coiled " + a.getName() + " and eated it");
    }
}

class Farmer{
    public void bringWater(String destination){
        System.out.println("Farmer bring water to " + destination + ".");
    }
    
    public void bringAnimal(Animal a,String destination){
        System.out.println("Farmer bring " + a.getName() + " to " + destination + ".");
    }

    public void feedWater(Animal a){
        this.bringWater("Feeding Room");
        a.move("Feeding Room");
        a.drink();
    }

    public void feedAnimal(Huntable hab, Animal a){
        this.bringAnimal(a,"Feeding Room");
        Animal ht = (Animal)hab;
        ht.move("Feeding Room");
        hab.hunt(a);
    }

}
