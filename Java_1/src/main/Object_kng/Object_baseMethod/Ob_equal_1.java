package Object_kng.Object_baseMethod;

class Ob_4{
	private int id;
	private String name;
	
	public Ob_4(int id, String name){
		this.id = id;
		this.name = name;
	}	
}

public class Ob_equal_1{
	public static void f(){
		Ob_4 a = new Ob_4(1,"Kent");
		Ob_4 a2 = new Ob_4(1,"Kent");
		System.out.println((a == a2));

		a2 = a;
		System.out.println((a == a2));
	}	
}