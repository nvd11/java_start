package Thread_kng.Td_priority_kng;

class M_thrd_6 implements Runnable{
	public void run(){
		int i;
		Thread cur_thd = Thread.currentThread();
		for (i=1; i<10001; i++){
			System.out.printf("Thread %s: priority is %d, i is %d\n", cur_thd.getName(),cur_thd.getPriority(),i);
		}
	}
}

public class Td_priority_1{
	public static void f(){
		M_thrd_6 s = new M_thrd_6();
		Thread t1 = new Thread(s);
		Thread t2 = new Thread(s);
		t1.setName("T1");
		t2.setName("T2");

		t1.start();

		t1.setPriority(Thread.MIN_PRIORITY);  //set the priority to 1
		t2.setPriority(Thread.NORM_PRIORITY + 3); //set the priority to 8
		t2.start();

	}
}