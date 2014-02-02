package Object_kng.Final_kng;

class A12{
	final int id;
	final int id2 = 2;
	//final int id3; //error
	public A12(int id){
		this.id = id;
		//this.id2 = 2; //error
	}

	public void f(){
	 	//id2 = 2;  //error
	}
}

public class Final_3{

}