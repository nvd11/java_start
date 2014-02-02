package Object_kng.Final_kng;

class A10{
	int id;
	String name;

	public final void print(){
		System.out.printf("A10: id is %d, name is %s\n", id, name);	
	}

	public final static void print2(){
		System.out.printf("A10:print2\n");
	}

	private void print3(){  // Java will treat all the private mothods as final methods
		System.out.printf("A10:print3\n");
	}
}

class A11 extends A10{
	//error ,  final method cannot be overwrited in subclasses 
	//public void print(){
	//}

	//public int print(){
	// return 0;
	//}

	public void print3(){ // it's not overwriting superclass's print3, another mother
	                                 //have a same name with superclass's print3
		System.out.printf("A11:print3\n");
	}
}


public class Final_2{
	public static void f(){
		A11 a11 = new A11();
		a11.id = 1;
		a11.name = "jack";	
		a11.print();
		a11.print2(); //  A10:print2
		a11.print3(); //  A11:print3
	}
}