package Thread_kng;

class S_thrd_1{
	public void f(){
		while (true){
			System.out.printf("Thread main is runing!\n");
		}

		//System.out.printf("f() is done!\n");  //compilation fail
	}
}

public class S_thread_expl{
	public static void f(){
		S_thrd_1 s = new S_thrd_1();
		s.f();	
		System.out.printf("g() is done!\n");
	}
}