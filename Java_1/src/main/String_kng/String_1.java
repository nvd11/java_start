package String_kng;

public class String_1{
    public static void f(){
        char c[] = {'a','b','c'};
        System.out.printf("c[] is %s\n", c.hashCode());
        int i;
        for (i=0;i<3;i++){
            System.out.printf("c[%d] is %c\n",i,c[i]);
        }
        
        c[0] = 'e'; 
        System.out.printf("c[] is %s\n", c.hashCode());
        for (i=0;i<3;i++){
            System.out.printf("c[%d] is %c\n",i,c[i]);
        }

        String e = "abc";
        System.out.printf("e is %s\n", e);


        String f = new String(c);
        System.out.printf("f is %s\n", f);
        System.out.printf("f is %s\n", f.hashCode());

        c[1] = 'g';
        System.out.printf("f is %s\n", f);

    }
}
