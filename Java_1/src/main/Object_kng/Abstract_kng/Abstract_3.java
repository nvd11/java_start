package Object_kng.Abstract_kng;

abstract class Abs_A6{
	int id;
	String name;
	public Abs_A6(int id, String name){  //abstract class can have non-abstract function.
		this.id = id;
		this.name = name;
	}

	public abstract void print();  //abstract function, with no function body, must have symbol ";"

	public static void print2(){
		System.out.print("A4:function print2\n");	
	}

	//private abstract void print3();

	// cannot use "static" & "abstract" together
	//public static abstract void print3();
}

abstract class A7 extends Abs_A6{
	public A7(int id, String name){
		super(id, name);
	}

	//note: must subclass must overwrite all the abstract function of it's superclass
	public void print(){  //overwrite superclass' abstract function
		System.out.printf("A5: id is %d, name is %s\n", id, name);
	}

	//error!  cannot define an abstract function in a non-abstract class
	//public abstract void print4();

	public static void print7(){
		System.out.printf("A7: print7\n");
	}

}


public class Abstract_3{
	public static void f(){
		A7.print7();
	}
}