package Exception_kng;

class Exp1{
	public int f(int a, int b){
		return a/b;
	}
}

public class Expt_1{
	public static void g(){
		Exp1 e = new Exp1();
		int i = e.f(8,0);
		System.out.printf("i is %d\n", i);
	}
}