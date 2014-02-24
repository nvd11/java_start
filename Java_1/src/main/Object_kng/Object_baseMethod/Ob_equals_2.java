package Object_kng.Object_baseMethod;

class Ob_5{
	private int id;
	private String name;
	
	public Ob_5(int id, String name){
		this.id = id;
		this.name = name;
	}	
}

public class Ob_equals_2{
	public static void f(){
		Ob_5 a = new Ob_5(1,"Kent");
		Ob_5 a2 = new Ob_5(1,"Kent");
		System.out.println((a.equals(a2)));

		a2 = a;
		System.out.println((a.equals(a2)));
	}	
}