import Base_kng.*;
//import Object_kng.*;
import Object_kng.Pkg_1.*;
import Object_kng.Super_kw.*;
import Object_kng.Overwrite_kng.*;
import Object_kng.Poly_kng.*;
import Object_kng.Abstract_kng.*;
import Object_kng.Final_kng.*;
import Interface_kng.*;
import Interface_kng.Extend.*;

public class Enter_1{
	public static void main(String[] args){
		System.out.printf("hello ant, it's the my meeting with ant!\n");
		//test_out_put();
		//one_object();
		//inherit_kng1();
		//super_kw();
		//Ovwrite1.f();
		//Poly_1.f();
		//Poly_2.f();
		//Poly_3.print();
		//Abstract_1.f();
		//Abstract_2.f();
		//Final_2.f();
		//Interface_1.f();
		Interface_3.f();
	}


	private static void test_out_put(){
		Base_test1 bt1 = new Base_test1();
		bt1.test_output1();
		bt1.test_output2();
		bt1.test_output3();
		bt1.test_output4();
		bt1.test_convert1();
	}

	//only allow to create one object
	private static void one_object(){
		Static_1_object obj1;
		Static_1_object obj2;
		obj1 = Static_1_object.create();
		obj1.j = 10;
		obj1.print();

		obj2 = Static_1_object.create();
		obj2.print();
	}

	//inherit kng 1
	private static void inherit_kng1(){
		Sub_c3 sc3 = new Sub_c3();
		sc3.f();
	}

	//Super kng
	private static void super_kw(){
		Super_kw.f();	
	}	
}
