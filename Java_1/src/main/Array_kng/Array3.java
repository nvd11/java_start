package Array_kng;

public class Array3{
    public static void f(){
        char[] cArr =  new char[10];
        cArr[0] = 'a';
        cArr[1] = 'b';
        cArr[2] = '\n';
        cArr[3] = 'c';
        

        int i;
        for (i=0; i< cArr.length; i++){
            System.out.printf("%c",cArr[i]);
        }

        System.out.println("======================================");
        System.out.printf("i is %d\n",i);
        for (i=0; i<9; i++){
            System.out.printf("%c",cArr[i]);
        }
        System.out.println("======================================");
        System.out.printf("i is %d\n",i);
    }


}
