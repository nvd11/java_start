package String_kng;

public class StringBuffer_1{
    public static void f(){
        String s = new String("abcde");
        String s2 = s.replace(s.substring(3,4), "");
        System.out.printf("%s\n",s2);     
    }
}
