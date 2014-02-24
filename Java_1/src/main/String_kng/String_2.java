package String_kng;

class Human_1{
    int id;
    int age;
    public Human_1(int id, int age){
        this.id = id;
        this.age = age;
    }
    public String toString(){
        return "id is " + id + ","  + " age is " + age;
    }
}

public class String_2{
    public static void f(){
        Human_1 h = new Human_1(1,30);
        Human_1 h2 = h; //
        System.out.printf("h: %s\n", h.toString()); 
        System.out.printf("h2: %s\n\n", h.toString()); 

        h.id = 3;
        h.age = 32;
        System.out.printf("h: %s\n", h.toString()); 
        System.out.printf("h2: %s\n\n", h.toString()); 

        System.out.println( h == h2 );
    }
}
