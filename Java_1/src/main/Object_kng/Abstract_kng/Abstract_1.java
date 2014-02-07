package Object_kng.Abstract_kng;

import Interface_kng.*;

abstract class Abs_A1{
	int id;
	String name;	
	abstract void print();
}


class A2 extends Abs_A1{
	void print(){
		System.out.printf("A2\n");
	}	
}

abstract class Abs_A3 extends A2{
	abstract void print();	
}

public class Abstract_1{
	public static void f(){
		//Abs_A1 a1 = new Abs_A1();   //error
		A2 a2 = new A2(); //ok
		//Abs_A3 a3 = new Abs_A3() //error

		Abs_A1 a1 = new A2(); //ok,  
		a1.print();
	}
}