package Thread_kng.Td_synchronized;

class Sell_ticket2 implements Runnable{
	public int tickets = 50; //count of tickets
	public int unit_price = 30; //unit_price of per ticket
	public int sum_price = 0; //total turnover

	private int pre_counts;

	public Sell_ticket2(){
		pre_counts = this.tickets;
	}

    Thread cur_thrd;

    //verify account of buyer
	private void accountVerify(){
		System.out.printf("Thread %s: account is valid!\n", cur_thrd.getName());
	}

	//previous preparation
	private void pre_Jobs(){
		System.out.printf("Thread %s: it's prepared!\n", cur_thrd.getName());
	}

	private synchronized void sellTicket(){
		this.accountVerify();
		this.pre_Jobs();
		if (this.tickets > 0){
			System.out.printf("Thread %s: sold the no.%d ticket!\n", cur_thrd.getName(),pre_counts - tickets + 1);
			tickets--;
			sum_price+=unit_price;
		}
		else{
			System.out.printf("Thread %s: all the tickets are sold out!\n", cur_thrd.getName(),pre_counts - tickets + 1);
		}
	}

	public void run(){
	    cur_thrd = Thread.currentThread();
		while(this.tickets > 0){
			this.sellTicket();	
		}
	}
}


public class Td_syn_2{
	public static void st(){
		Sell_ticket2 s = new Sell_ticket2();
		Thread a = new Thread(s);
		Thread b = new Thread(s);
		Thread c = new Thread(s);
		a.setName("A");
		b.setName("B");
		c.setName("C");

		a.start();
		b.start();
		c.start();

		try{
			Thread.currentThread().sleep(5000);
		}catch(Exception e){
			e.printStackTrace();
		}

		System.out.printf("Turnover is %d\n", s.sum_price);
	}
}