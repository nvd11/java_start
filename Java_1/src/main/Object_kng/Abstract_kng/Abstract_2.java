package Object_kng.Abstract_kng;

abstract class Abs_A4{
	int id;
	String name;
	public Abs_A4(int id, String name){  //abstract class can have non-abstract function.
		this.id = id;
		this.name = name;
	}

	public abstract void print();  //abstract function, with no function body, must have symbol ";"

	public static void print2(){
		System.out.print("A4:function print2\n");	
	}

	//cannot use "private" & "abstract" together
	//private abstract void print3();

	// cannot use "static" & "abstract" together
	//public static abstract void print3();
}

class A5 extends Abs_A4{
	public A5(int id, String name){
		super(id, name);
	}

	//note: must subclass must overwrite all the abstract function of it's superclass
	public void print(){  //overwrite superclass' abstract function
		System.out.printf("A5: id is %d, name is %s\n", id, name);
	}

	//error!  cannot define an abstract function in a non-abstract class
	//public abstract void print4();


}


public class Abstract_2{
	public static void f(){
		Abs_A4 a4 = new A5(1, "Jack");
		a4.print();

	}
}