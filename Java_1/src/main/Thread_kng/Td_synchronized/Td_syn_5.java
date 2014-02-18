package Thread_kng.Td_synchronized;

class Sell_ticket5 extends Thread{
	public static int tickets = 50; //count of tickets
	public static int unit_price = 30; //unit_price of per ticket
	public static int sum_price = 0; //total turnover

	private int pre_counts;

	public Sell_ticket5(String name){
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

	private static int i_flag;
	private static String s_flag = "flag_of_objectlock"; //assignmen is needed, otherwise will 
	                                                     //throw exception when being synchronized

	private void sellTicket(){
		this.accountVerify();
		this.pre_Jobs();

		//synchronized (i_flag) //error integer variable is not an object
		synchronized (s_flag){ //try to lock the object i_flag
			if (this.tickets > 0){
				System.out.printf("Thread %s: sold the no.%d ticket!\n", this.getName(),pre_counts - tickets + 1);
				tickets--;
				sum_price+=unit_price;
			}
			else{
				System.out.printf("Thread %s: all the tickets are sold out!\n", this.getName(),pre_counts - tickets + 1);
			}
		}
	}

	public void run(){
		while(this.tickets > 0){
			this.sellTicket();	
		}
		System.out.printf("Turnover is %d\n", Sell_ticket5.sum_price);
	}
}


public class Td_syn_5{
	public static void st(){
		Sell_ticket5 a = new Sell_ticket5("A");
		Sell_ticket5 b = new Sell_ticket5("B");
		Sell_ticket5 c = new Sell_ticket5("C");

		a.start();
		b.start();
		c.start();

		try{
			Thread.currentThread().sleep(5000);
		}catch(Exception e){
			e.printStackTrace();
		}

		System.out.printf("Turnover is %d\n", Sell_ticket5.sum_price);
	}
}