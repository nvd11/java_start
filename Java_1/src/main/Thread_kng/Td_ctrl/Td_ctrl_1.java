package Thread_kng.Td_ctrl;

class M_thrd_7 implements Runnable{
	public void run(){
		java.text.DateFormat d1 = java.text.DateFormat.getDateTimeInstance();
		java.util.Date now;
		Thread cur_thd = Thread.currentThread();

		int i;
		for (i=0; i<10; i++){
			now = new java.util.Date();
			System.out.printf("Thread %s: i is %d, time is %s\n",cur_thd.getName(), i, d1.format(now));

			try{
				cur_thd.sleep(3000);   //sleep 3 seconds, must be put into the try{}
			}
			catch(Exception e){

			}
		}

	}
}

public class Td_ctrl_1{
	public static void f(){
		M_thrd_7 s = new M_thrd_7();
		Thread t1 = new Thread(s);
		t1.setName("T1");
		t1.start();

		Thread t2 = new Thread(s);
		t2.setName("T2");
		t2.start();

	}
}