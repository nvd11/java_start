package Object_kng.InternalClass_kng;

public class InternalClass1{
    public static void f(){
        A a = new A(3);
        A.B b = a.new B();
        b.print();

        A.B b2 = new A(4).new B();
        b2.print();
    }
}

class A{
    private int i;
    public A(int i){
        this.i = i;
    }

    class B{
        public void print(){
            System.out.printf("A.i is %d\n",i);
        }
    }
}
