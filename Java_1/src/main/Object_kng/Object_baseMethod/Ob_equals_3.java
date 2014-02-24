package Object_kng.Object_baseMethod;

class Ob_6{
	private int id;
	private String name;
	
	public Ob_6(int id, String name){
		this.id = id;
		this.name = name;
	}	

	public int hashCode(){
		return 1;
	}
}

public class Ob_equals_3{
	public static void f(){
		Ob_6 a = new Ob_6(1,"Kent");
		Ob_6 a2 = new Ob_6(2,"David");
		System.out.println(a);
		System.out.println(a2);
		System.out.println((a.equals(a2)));
		System.out.println((a == a2));

		a2 = a;
		System.out.println((a.equals(a2)));
		System.out.println((a == a2));
	}	
}