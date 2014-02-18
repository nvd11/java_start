package Thread_kng;

class M_thrd_2 implements Runnable{  //extends
	public int id = 0;

	public void run(){ //overwrite the method run() of superclass
		while (true){
			System.out.printf("%s: Thread " + this.id+ " is runing!\n", Thread.currentThread().getName());
		}

		//System.out.printf("f() is done!\n");  //compilation fail
	}
}

public class M_thread_expl2{
	public static void g(){
		M_thrd_2 s = new M_thrd_2();
		s.id = 1;
		Thread t1 = new Thread(s);
		t1.start();

		Thread t2 = new Thread(s);
		s.id = 2;
		t2.run();
	}
}