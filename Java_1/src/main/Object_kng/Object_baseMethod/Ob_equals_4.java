package Object_kng.Object_baseMethod;

class Ob_7{
	private int id;
	private String name;
	
	public Ob_7(int id, String name){
		this.id = id;
		this.name = name;
	}	

	public boolean equals(Object obj){
		Ob_7 ob;
		try{
			ob = (Ob_7)obj;
		}catch(ClassCastException e){
			System.out.printf("warning: the object is not belonged to Class Ob_7!!\n");
			return false;
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}

		if (this.id == ob.id && this.name == ob.name){
			return true;
		}
		return false;
	}
}

public class Ob_equals_4{
	public static void f(){
		Ob_7 a = new Ob_7(1,"Kent");
		Ob_7 a2 = new Ob_7(1,"Kent");
		Ob_7 a3 = new Ob_7(2,"David");
		System.out.println((a.equals(a2)));
		System.out.println((a.equals(a3)));
		System.out.println((a.equals(new Ob_6(1,"kent"))));

		a2 = a;
		System.out.println((a.equals(a2)));
	}	
}