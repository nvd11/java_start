import Base_kng.*;
//import Object_kng.*;
import Object_kng.Pkg_1.*;
import Object_kng.Super_kw.*;
import Object_kng.Overwrite_kng.*;
import Object_kng.Poly_kng.*;
import Object_kng.Abstract_kng.*;
import Object_kng.Final_kng.*;
import Object_kng.InternalClass_kng.*;
import Interface_kng.*;
import Interface_kng.Extend.*;
import Interface_kng.Animal_1.*;
import Interface_kng.Animal_2.*;
import Interface_kng.Animal_3.*;
import Package_kng.*;
import Exception_kng.*;
import Thread_kng.*;
import Thread_kng.Td_priority_kng.*;
import Thread_kng.Td_ctrl.*;
import Thread_kng.Td_synchronized.*;
import Thread_kng.Td_wait_notify.*;
import Object_kng.Object_baseMethod.*;
import String_kng.*;
import Collection_kng.*;
import Collection_kng.Comparable_kng.*;
import Collection_kng.HashSet_kng.*;
import Collection_kng.Iterator_kng.*;
import Collection_kng.HashMap_kng.*;
import Array_kng.*;
import Stream_kng.*;
import Stream_kng.BufferStream_kng.*;
import Stream_kng.DataStream_kng.*;
import Stream_kng.ConvertStream_kng.*;
import Stream_kng.PrintStream_kng.*;
import UDP_kng.*;

public class Enter_1{
	public static void main(String[] args) throws Exception{
		//System.out.printf("hello ant, it's the my meeting with ant!\n");
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
		//Interface_3.f();
		//Pkg_1.f();
		//Expt_6.g();
		//Ob_tostring_1.f();
		//Ob_tostring_2.f();
		//Ob_equal_1.f();
		//Ob_equals_2.f();
		//Ob_equals_3.f();
		//Ob_equals_4.f();
		//Ob_equals_5.f();
		//Ob_getclass_1.f();
		//S_thread_expl.f();
		//M_thread_expl.f();
		//M_thread_expl2.g();
		//Td_priority_1.f();
		//Td_ctrl_1.f();
		//Td_yield_1.f();
		//Td_join_1.f();
		//Td_syn_1.st();
		//Td_syn_2.st();
		//Td_syn_3.st();
		//Td_syn_4.st();
		//Td_syn_5.st();
		//Td_syn_test.st();
        //String_5.f();
        //StringBuffer_3.f();
        //Td_prod_1.f();
        //Td_prod_2.f();
        //Collect1.f();
        //Collect1.h();
        //Compare1.f();
        //Compare2.f();
        //Hashset1.f();
        //Iterator1.f();
        //HashMap1.f();
        //Array1.f();
        //Array2.f();
        //Array3.f();
        //Stream1.f();
        //Reader4.f();
        //Writer2.f();
        //InputStream1.f();
        //Stream3.f();
        //BufferStream1.f();
        //DataStream1.f();
        //DataStream2.f();
        //PrintStream1.f();
        //SystemOut1.f();
        //SystemErr1.f();
        //GetStrFromKeyBoard2.f();
        //UDP_Client1.f();
        //UDP_Server1.f();
        //Animal_1.f();
        //Animal_2.f();
        //Animal_3.f();
        //InternalClass1.f();
        //InternalClass2.f();
        //InternalClass3.f();
        InternalClass4.f();
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
