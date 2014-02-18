package Thread_kng.Td_ctrl;

class M_thrd_10 extends Thread{
	public M_thrd_10(String name){
		super(name);
	}

	public void run(){
		int i;
		for (i=0; i<1000; i++){
			System.out.printf("Thread %s: i is %d\n",this.getName(), i);
		}
	}
}

class M_thrd_11 extends Thread{
	private M_thrd_10 t_join;

	public M_thrd_11(String name, M_thrd_10 t_join){
		super(name);
		this.t_join = t_join;
	}

	public void run(){
		int i;
		for (i=0; i<501; i++){
			System.out.printf("Thread %s: i is %d\n",this.getName(), i);
		}

		try{
			t_join.join();	
		}
		catch(Exception e){

		}

		for (; i<1000; i++){
			System.out.printf("Thread %s: i is %d\n",this.getName(), i);
		}
	}
}

public class Td_join_1{
	public static void f(){
		M_thrd_10 t1 = new M_thrd_10("T1"); 
		M_thrd_10 t2 = new M_thrd_10("T2"); //will not impacted by t1.join()
		M_thrd_11 t3 = new M_thrd_11("T3",t1);

		t1.start();
		t3.start();
		t2.start();
	}
}