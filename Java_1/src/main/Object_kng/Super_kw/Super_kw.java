package Object_kng.Super_kw;

class Ak1{
	public int i;
	private int j;

	//sub classes will use this constructor default
	public Ak1(){
		this.i = 22;
		this.j = 23;
	}

	public Ak1(int i, int j){
		this.i = i;
		this.j = j;
	}

	public void print(){
		System.out.printf("i is %d, j is %d\n", i, j);
	}

}

class Bk1 extends Ak1{
	int k;
    public Bk1(int i, int j, int k){
    	//super();
     	super(i,j);
     	//k = i + j + k;
     	this.k = k;
     }

	public void print(){
		super.print();
		System.out.printf("k is %d\n", k);	
	}
}

public class Super_kw{
	public static void f(){
		System.out.printf("hei\n");
		Bk1 bk = new Bk1(1,5,3);
		bk.print();
	}
}