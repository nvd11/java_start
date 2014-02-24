package String_kng;

public class StringBuffer_2{
    public static void f(){
        StringBuffer sb = new StringBuffer("InterMilan");
        System.out.printf("length of sb is %d\n",sb.length());     
        System.out.printf("char[5] of sb is %c\n",sb.charAt(5));     
        try{
            System.out.printf("char[10] of sb is %c\n",sb.charAt(10));     
        }catch(StringIndexOutOfBoundsException e){
            System.out.printf("Index 10 is out of bounds\n");
        }

        sb.setLength(12);
        System.out.printf("\nsb is %s\n",sb);     
        System.out.printf("length of sb is %d\n",sb.length());     
        System.out.printf("char[10] of sb is %c\n\n",sb.charAt(10));     

        sb.setLength(5);
        System.out.printf("sb is %s\n",sb);     
        
        try{
            System.out.printf("char[5] of sb is %c\n",sb.charAt(5));     
        }catch(StringIndexOutOfBoundsException e){
            System.out.printf("Index 5 is out of bounds\n");
        }
    }
}
