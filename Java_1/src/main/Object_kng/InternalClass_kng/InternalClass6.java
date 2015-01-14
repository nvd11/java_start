package Object_kng.InternalClass_kng;


public class InternalClass6{
    public static void f(){
        Ib b = new A6().GetIB(4);
        b.f();
    }
}

class A6{
    private int i = 100;

    public Ib GetIB(final int x){
        //a new internal class which implements interface Ib 
        return new Ib(){
            public void f(){
                System.out.println("this is a method implemented from a interface!");
                System.out.println(i+x);
            }
        };

    }
}

interface Ib{
    void f();
}
