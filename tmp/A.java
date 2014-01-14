class B{
	int i = 1;
	int f(){
		System.out.printf("i is %d\n", i);
		return 0;
	}

	static int j = 1;
	static int g(){
		System.out.printf("j is %d\n", j);
		return 0;
	}
}

public class A{
	public static void main(String[] args){
		B.g();
		B.j += 1;
		B b;
		b = new B();
		b.i = 10;
		b.j += 1;
		b.f();
		b.g();
	}
}
