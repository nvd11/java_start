package Thread_kng;

class M_thrd_1 extends Thread{  //extends
	public M_thrd_1(String name){
		super(name);
	}

	public void run(){ //overwrite the method run() of superclass
		while (true){
			System.out.printf("Thread " + this.getName()+ " is runing!\n");
		}

		//System.out.printf("f() is done!\n");  //compilation fail
	}
}

public class M_thread_expl{
	public static void f(){
		M_thrd_1 s = new M_thrd_1("T1");
		s.start(); //start()method is extended from superclass, it will call the method run()
		M_thrd_1 s2 = new M_thrd_1("T2");
		s2.start();

		while (true){
			System.out.printf("Thread Main is runing!\n");
		}
	}
}