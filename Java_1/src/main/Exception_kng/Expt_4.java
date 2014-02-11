package Exception_kng;

import java.net.*;
import java.io.*;

class Exp4{
	public int f(int a, int b) throws IOException, BindException{
		return a/b;
	}
}

public class Expt_4{
	public static void g(){
		Exp4 ex = new Exp4();
		int i = 22;
		try{
			System.out.printf("g() : try!!\n");  //failed
			i = ex.f(8,0); //call f()  
		}
		catch(BindException e){
			System.out.printf("g() : BindException!!\n");  //failed
		}
		catch(IOException e){
			System.out.printf("g() : IOException!!\n");  //failed
		}
		finally{
			System.out.printf("g() : finaly!!\n");  //successfully executed
		}
		System.out.printf("g() is done!!\n");  //failed
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