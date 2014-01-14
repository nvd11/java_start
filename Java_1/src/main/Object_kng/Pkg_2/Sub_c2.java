package Object_kng.Pkg_2;

import Object_kng.Pkg_1.*;

public class Sub_c2 extends Super_c1{
	public int f(){
		pu_i = 1;
		pt_i = 2;	
		//fr_i = 3;  cannot access the object belonged to another package
		//pr_i = 4;
		return 0;
	}	
}