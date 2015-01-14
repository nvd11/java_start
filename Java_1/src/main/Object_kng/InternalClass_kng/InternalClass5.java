package Object_kng.InternalClass_kng;


public class InternalClass5{
    public static void f(){
        new A5().printB(3);
    }
}

class A5{
    private int i = 100;

    public void printB(final int x){
        //a new internal class which inherits Thread 
        new Thread(){
            public void run(){
                while(i > 0){
                    System.out.println(i);
                    i = i -x;
                }
            }
        }.start();

    }
}
