package Base_kng;

public class Static_1_object{
	static int i = 0;
	public int j = 0;
	private Static_1_object(){

	}

	//printer
	private static Static_1_object sobj;

	public static Static_1_object create(){
		if (i <= 0){
			sobj = new Static_1_object();
			i++; 
			return sobj;
		}

		return sobj;
	}

	public void print(){
		System.out.printf("j is %d\n",j);
	}
}