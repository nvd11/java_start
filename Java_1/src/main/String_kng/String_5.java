package String_kng;

public class String_5{
    public static String g(){
        String s4 = "cat";
        return s4;
    }

    public static void f(){
        String s = new String("cat");
        String s2 = "cat";
        String s3 = "cat";
        System.out.printf("s: %s\n", s); 
        System.out.printf("s2: %s\n", s2); 
        System.out.printf("s3: %s\n", s3); 
        
        System.out.println(s == s2); 
        System.out.println(s2 == s3); 
        System.out.println(s2 == g()); 
    }
}
