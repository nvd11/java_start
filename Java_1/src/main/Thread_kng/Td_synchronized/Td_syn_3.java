package Thread_kng.Td_synchronized;

class Sell_ticket3 extends Thread{
	public static int tickets = 50; //count of tickets
	public static int unit_price = 30; //unit_price of per ticket
	public static int sum_price = 0; //total turnover

	private int pre_counts;

	public Sell_ticket3(String name){
		super(name);
		pre_counts = this.tickets;
	}

    //verify account of buyer
	private void accountVerify(){
		System.out.printf("Thread %s: account is valid!\n", this.getName());
	}

	//previous preparation
	private void pre_Jobs(){
		System.out.printf("Thread %s: it's prepared!\n", this.getName());
	}

	private synchronized void sellTicket(){
		this.accountVerify();
		this.pre_Jobs();
		if (this.tickets > 0){
			System.out.printf("Thread %s: sold the no.%d ticket!\n", this.getName(),pre_counts - tickets + 1);
			tickets--;
			sum_price+=unit_price;
		}
		else{
			System.out.printf("Thread %s: all the tickets are sold out!\n", this.getName(),pre_counts - tickets + 1);
		}
	}

	public void run(){
		while(this.tickets > 0){
			this.sellTicket();	
		}
	}
}


public class Td_syn_3{
	public static void st(){
		Sell_ticket3 a = new Sell_ticket3("A");
		Sell_ticket3 b = new Sell_ticket3("B");
		Sell_ticket3 c = new Sell_ticket3("C");

		a.start();
		b.start();
		c.start();

		try{
			Thread.currentThread().sleep(5000);
		}catch(Exception e){
			e.printStackTrace();
		}

		System.out.printf("Turnover is %d\n", Sell_ticket3.sum_price);
	}
}