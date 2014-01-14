import Base_kng.*;
import Object_kng.*;

public class Enter_1{
	public static void main(String[] args){
		System.out.printf("hello ant, it's the my meeting with ant!\n");
		//test_out_put();
		one_object();
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
}
