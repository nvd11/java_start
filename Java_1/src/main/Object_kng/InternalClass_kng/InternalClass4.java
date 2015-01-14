package Object_kng.InternalClass_kng;

public class InternalClass4{
    public static void f(){
        new A4(2).printB(3,6);
    }
}

class A4{
    private int i;

    public A4(int i){
        this.i = i;
    }

    public void printB(final int x, int y){
        //class B
        class B4{
            public int getSum(){
                return i + x;
            }
        }        

        System.out.println(new B4().getSum() + y);
    }
}
