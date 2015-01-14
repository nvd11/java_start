package Object_kng.InternalClass_kng;

public class InternalClass3{
    public static void f(){
        A3.printj(3);
    }
}

class A3{
    private int i;
    private static int j;

    public static void printj(int j){
        B3 b = new B3(j);
        b.print();
    }

    private static class B3{
        public B3(int j){
            //A3.i= 3;//error
            A3.j = j;
        }
        public void print(){
            System.out.printf("A.j is %d\n",j);
        }
    }
}
