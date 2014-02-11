package Exception_kng;

class Exp2{
	public int f(int a, int b){
		int i = 0;
		try{
			i = a/b;
		}
		catch(Exception e){
			System.out.printf("Exception occurs!!\n");
			System.out.println(e.getMessage());  //print the root cause
			System.out.printf("===========================\n");
			e.printStackTrace(); //print the info of function stuck.
		}

		return i;
	}
}

public class Expt_2{
	public static void g(){
		Exp2 ex = new Exp2();
		int i = ex.f(8,0); //call f()
		System.out.printf("i is %d\n", i);  //successfully executed
	}
}