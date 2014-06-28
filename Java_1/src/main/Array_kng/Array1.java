package Array_kng;

public class Array1{
    public static void f(){
        int a[];
        a = new int[5];
        a[0] = 0;
        a[1] = 1;
        a[2] = 2;
        a[3] = 3;
        a[4] = 4;

        int[] b = new int[]{1,2,3};
        int[] c = {1,2,3};

        showArr(a);
        showArr(b);
        showArr(c);
    }

    public static void showArr(int[] a){
        int i;
        for (i=0; i<a.length; i++){
            System.out.println(a[i]);
        }
    }
}
