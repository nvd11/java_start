package Object_kng.Pkg_1;

public class Super_c3{
	//can be inherited
	public int pu_id;

	//cannot be inherited
	private int id = 0;

	//canbe inherited
	public boolean set_id(int i_id){
		this.id = i_id;
		return true;
	}

	public int get_id(){
		return this.id;
	}

	public void print_id(){
		System.out.printf("id is %d\n", this.get_id());
	}
}