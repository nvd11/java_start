package Object_kng.Object_baseMethod;

class Ob_2{

}

class Ob_3 extends Ob_2{

}

public class Ob_getclass_1{
	public static void f(){
		Ob_2 a = new Ob_2();
		System.out.printf("%s\n", a.getClass());
		a = new Ob_3();
		System.out.printf("%s\n", a.getClass());
	}	
}