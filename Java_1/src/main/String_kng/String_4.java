package String_kng;

public class String_4{
    public static void f(){
        String s = new String("cat");
        String s2 = new String("cat");

        System.out.printf("s: %s\n", s); 
        System.out.printf("s2: %s\n", s2); 
        System.out.println(s == s2); 
        System.out.println(s.equals(s2));
    }
}
