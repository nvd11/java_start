package Collection_kng;
import java.util.ArrayList;

class A{
    private int i;
    public A(int i){
        this.i = i;
    }

    public String toString(){
        return "" + this.i;
    }
}

public class Collect1{
    public static void f(){
        A[] arr_A = new A[10];
        int i;
        for(i = 0; i < 10; i++){
            arr_A[i] = new A(i);
        }     

        A[] arr_A2 = new A[11];
        System.arraycopy(arr_A,0,arr_A2,0,10);

        arr_A2[10] = new A(11);
        for(i = 0; i < 11; i++){
           System.out.println(arr_A2[i]); 
        }     
    }

    public static void g(){
        ArrayList arr_l = new ArrayList();
        int i;
        for(i = 0; i < 10; i++){
             arr_l.add(new A(i));
        }     

        arr_l.add(new A(11));
        for(i = 0; i < 11; i++){
           System.out.println(arr_l.get(i)); 
        }     
    }
}
