package Exception_kng;

class User_Exception1 extends ArithmeticException{
	public User_Exception1(String Exception_name){
		super(Exception_name);
	}

	public void printStackTrace(){ //overwrite
		super.printStackTrace();
		System.out.printf("hey man, i am an user_defined excetpion\n");  
	}
}

class Exp6{
	public int f(int a, int b){
		if (0 == b){
			throw new User_Exception1("Shit !!! / by zero!"); //use User_defined exception
		} 

		return a/b;
	}
}

public class Expt_6{
	public static void g() {
		Exp6 ex = new Exp6();
		int i = 22;
		try{
			i = ex.f(8,0); //throw excetpion 
		}catch(User_Exception1 e){
			e.printStackTrace();
		}
		System.out.printf("i is %d\n", i); 
		System.out.printf("g() is done!!\n"); 
	}
}