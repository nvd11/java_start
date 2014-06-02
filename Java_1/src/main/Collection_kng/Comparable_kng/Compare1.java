package Collection_kng.Comparable_kng;
import java.util.ArrayList;
import java.util.Collections;

public class Compare1{
    public static void f(){
        ArrayList arr = new ArrayList();
        arr.add(10);
        arr.add(23);
        arr.add(7);

        System.out.println(arr);

        Collections.sort(arr);
        
        System.out.println(arr);
    } 
}


