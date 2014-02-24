package String_kng;

public class StringBuffer_3{
    public static void f(){
        StringBuffer sb = new StringBuffer();
        System.out.printf("%d\n",sb.length());     
        sb.append("Abv");
        System.out.printf("%d\n",sb.length());     

        sb.append("Abv");
        StringBuffer sb2 = new StringBuffer(5);
        System.out.printf("%d\n",sb2.length());     


        StringBuffer sb3 = new StringBuffer("InterMilan");
        sb3.setLength(7); 
        System.out.printf("%s\n",sb3);     
        System.out.printf("%c\n",sb3.charAt(6));     

        sb3 = sb3.insert(sb3.length(),"shit");
        sb3 = sb3.reverse();
        System.out.printf("%s\n",sb3);     
    }
}
