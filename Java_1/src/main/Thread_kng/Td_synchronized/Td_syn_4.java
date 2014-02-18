package Thread_kng.Td_synchronized;

class Sell_ticket4 extends Thread{
	public static int tickets = 50; //count of tickets
	public static int unit_price = 30; //unit_price of per ticket
	public static int sum_price = 0; //total turnover

	private static int pre_counts;

	public Sell_ticket4(String name){
		super(name);
		pre_counts = this.tickets;
	}

    //verify account of buyer
	private static void accountVerify(){
		System.out.printf("Thread %s: account is valid!\n", Thread.currentThread().getName());
	}

	//previous preparation
	private static void pre_Jobs(){
		System.out.printf("Thread %s: it's prepared!\n", Thread.currentThread().getName());
	}

	private synchronized static void sellTicket(){
		accountVerify();
		pre_Jobs();
		if (tickets > 0){
			System.out.printf("Thread %s: sold the no.%d ticket!\n", Thread.currentThread().getName(),pre_counts - tickets + 1);
			tickets--;
			sum_price+=unit_price;
		}
		else{
			System.out.printf("Thread %s: all the tickets are sold out!\n", Thread.currentThread().getName(),pre_counts - tickets + 1);
		}
	}

	public void run(){
		while(this.tickets > 0){
			this.sellTicket();	
		}
	}
}


public class Td_syn_4{
	public static void st(){
		Sell_ticket4 a = new Sell_ticket4("A");
		Sell_ticket4 b = new Sell_ticket4("B");
		Sell_ticket4 c = new Sell_ticket4("C");

		a.start();
		b.start();
		c.start();

		try{
			Thread.currentThread().sleep(5000);
		}catch(Exception e){
			e.printStackTrace();
		}

		System.out.printf("Turnover is %d\n", Sell_ticket4.sum_price);
	}
}