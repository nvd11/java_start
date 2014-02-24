package Object_kng.Object_baseMethod;

class Ob_1{
	private int x;
	private int y;

	public Ob_1(int x, int y){
		this.x = x;
		this.y = y;
	}

	public String toString(){
		return "[" + x +"," + y +"]" ;
	}
}

public class Ob_tostring_1{
	public static void f(){
		Ob_1 a = new Ob_1(2,4);
		System.out.printf("%s\n", a.toString());
		System.out.printf("%s\n", a); //ok same as below
		System.out.println(a); //ok same as below
	}	
}