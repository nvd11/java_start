package Object_kng.Overwrite_kng;

class Ov3{
	void f(){
		System.out.printf("OV1\n");
	}

}

class Ov4 extends Ov3{
	//public int f() // error ! for overwrite,  must be same return type with supper class
	//private void f(){ // error ! the permission cannot be smaller than super classes
	public void f(){   //ok, the permission canbe bigger than super classes'
		System.out.printf("OV2\n");
	}


}

public class Ovwrite2{
	public static void f(){
		Ov4 ov4 = new Ov4();
		ov4.f();
	}
}