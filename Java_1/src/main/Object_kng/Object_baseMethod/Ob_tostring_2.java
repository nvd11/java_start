package Object_kng.Object_baseMethod;

class Point_1{
	private int x;
	private int y;

	public Point_1(int x, int y){
		this.x = x;
		this.y = y;
	}

	public String toString(){
		return "[" + x +"," + y +"]" ;
	}
}

public class Ob_tostring_2{
	public static void f(){
		Point_1 a = new Point_1(2,4);
		System.out.printf("%s\n", a.toString());
		System.out.printf("%s\n", a); //ok same as below
		System.out.println(a); //ok same as below
	}	
}