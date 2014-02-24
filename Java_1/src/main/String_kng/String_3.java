package String_kng;

public class String_3{
    public static void f(){
        String s = "cat";
        String s2 = s;

        System.out.printf("s: %s\n", s); 
        System.out.printf("s2: %s\n", s2); 
        System.out.println(s == s2); 

        s = "dog";
        System.out.printf("\ns: %s\n", s); 
        System.out.printf("s2: %s\n", s2); 
        System.out.println(s == s2); 
    }
}
