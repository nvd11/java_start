package Object_kng.InternalClass_kng;

public class InternalClass2{
    public static void f(){
        //A2.B2 b = new A2(3).new B2(); //error
        A2 a = new A2(3);
        a.f();

    }
}

class A2{
    private int i;
    public A2(int i){
        this.i = i;
    }

    public void f(){
        B2 b = new B2();
        System.out.println(i + b.b);
    }

    private class B2{
        private int b =3;
        public void print(){
            System.out.printf("A.i is %d\n",i);
        }
    }
}
