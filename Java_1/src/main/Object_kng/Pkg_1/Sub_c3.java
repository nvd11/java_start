package Object_kng.Pkg_1;


public class Sub_c3 extends Super_c3{
	public void f(){
		//this.id = 12;  cannot access inherited privated member directly.
		this.set_id(11);
		this.print_id();
	}
}