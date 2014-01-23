package Object_kng.Overwrite_kng;

class Ov1{
	public void f(){
		System.out.printf("OV1\n");
	}

	//overload , function name must be same, the parameters must be different, 
	//the return type can be same or different 
	public int f(int i){
		System.out.printf("OV1 i\n");
		return 0;
	}
}

class Ov2 extends Ov1{
	//public int f()     //error ! must use the same return type with Super class's
	public void f(){
		super.f();
		f(10);   //simplely use inherited function.
		System.out.printf("OV2\n");
	}


}

public class Ovwrite1{
	public static void f(){
		Ov2 ov2 = new Ov2();
		ov2.f();
	}
}