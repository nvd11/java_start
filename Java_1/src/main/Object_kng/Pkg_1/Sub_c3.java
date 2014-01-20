package Object_kng.Pkg_1;


public class Sub_c3 extends Super_c3{

	private int id = 20;

	public void f(){
		//this.id = 12;  cannot access inherited privated member directly.
		this.set_id(11);
		this.id = 22;
		System.out.printf("parent id is %d, id is %d\n", this.get_id(), this.id);
	}
}