package Exception_kng;

class Exp3{
	public int f(int a, int b){
		if (0 == b){
			throw new ArithmeticException("Shit !!! / by zero!");
		} 

		return a/b;
	}
}

public class Expt_3{
	public static void g() throws ArithmeticException{
		Exp3 ex = new Exp3();
		int i = 22;
		i = ex.f(8,0); //throw excetpion 
		System.out.printf("i is %d\n", i);  //failed executed 
		System.out.printf("g() is done!!\n");  //failed executed
	}

	public static void h(){
		try{
			g();	
		}catch(ArithmeticException e){
			System.out.printf("Exception occurs!!\n");
			System.out.println(e.getMessage());  //print the root cause
			System.out.printf("===========================\n");
			e.printStackTrace(); //print the info of function stuck.
		}

		System.out.printf("h() is done!!\n");  //successfully executed
	}
}