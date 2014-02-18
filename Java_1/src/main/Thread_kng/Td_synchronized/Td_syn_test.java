package Thread_kng.Td_synchronized;

class Sell_ticket_test extends Thread{
	public static int tickets = 5000; //count of tickets
	public static int unit_price = 30; //unit_price of per ticket
	public static int sum_price = 0; //total turnover

	private int pre_counts;

	public Sell_ticket_test(String name){
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
	//private String s_flag = "flag_of_objectlock"; //assignmen is needed, otherwise will 
	                                                     //throw exception when being synchronized

	private void sellTicket(){
		int i;
		for (i=0; i<5; i++){
			sum_price++;
		}
	}

	public void run(){
			this.sellTicket();	
	}
}


public class Td_syn_test{
	public static void st(){
		Sell_ticket_test a = new Sell_ticket_test("A");
		Sell_ticket_test b = new Sell_ticket_test("B");
		Sell_ticket_test c = new Sell_ticket_test("C");

		a.start();
		b.start();
		c.start();

		try{
			Thread.currentThread().sleep(5000);
		}catch(Exception e){
			e.printStackTrace();
		}

		System.out.printf("Turnover is %d\n", Sell_ticket_test.sum_price);
	}
}