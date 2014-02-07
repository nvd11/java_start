package Interface_kng.Extend;

interface Itf_1{
	int i = 1;
	void f();
}

interface Itf_2{
	String i = "abc";
	int k = 2;  //same name with Itf_1
	void f();   //same name with Itf_1
	void g();
}

interface Itf_3 extends Itf_1, Itf_2{
	int j = 3;
}


class Itf_class1 implements Itf_1, Itf_2{
	public void f(){ //overwrite
		System.out.printf("i1 is %d, i2 is %s, k is %d", Itf_1.i, Itf_2.i, this.k);
	}	

	public void g(){
		
	}
}

class Itf_class2 extends Itf_class3 implements Itf_3{
	public void f(){ //overwrite
		System.out.printf("i1 is %d, i2 is %s, k is %d, j is %d\n", Itf_1.i, Itf_2.i, this.k, this.j);
	}	

	public void g(){
		
	}
}

class Itf_class3{

}

public class Interface_3{
	public static void f(){
		Itf_class2  a = new Itf_class2();
		a.f();
	}
}