package Thread_kng.Td_ctrl;

class M_thrd_8 extends Thread{
	public M_thrd_8(String name){
		super(name);
	}

	public void run(){
		int i;
		for (i=0; i<1000; i++){
			System.out.printf("Thread %s: i is %d",this.getName(), i);
			this.yield();
		}
	}
}

class M_thrd_9 extends Thread{
	public M_thrd_9(String name){
		super(name);
	}

	public void run(){
		int i;
		for (i=0; i<1000; i++){
			System.out.printf("\nThread %s: i is %d\n",this.getName(), i);
			//this.yield();
		}
	}
}

public class Td_yield_1{
	public static void f(){
		M_thrd_8 t1 = new M_thrd_8("T1");
		t1.start();

		M_thrd_9 t2 = new M_thrd_9("T2");
		t2.start();

	}
}