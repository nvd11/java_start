package Interface_kng;

interface It_1{ 
	int i = 10;  //public static final

	//int j;   //error all the members in a interface must be a const member 
			  //& need assignment

	//public abstract It_1();	  //error,  must without a constructor

	abstract void print(); //public abstract
}

class It_class1 implements It_1{  //implement an interface

	void f(){
		//i = 10;  error cannot do assignment for a const member
		int j = this.i;
	}

	//void print(){  the signal of authority cannot smaller than super class's(interface)
	public void print(){ // overwrite an the abstract method.
		System.out.printf("i is %d\n", i);
	}
}

public class Interface_1{
	public static void f(){
		It_1 a = new It_class1(); // Poly
		a.print();
	}
}