package Base_kng;

public class Base_test1{
	public void test_output1(){
		int i = 46;
		System.out.printf("%%x is %x, %%#x is %#x, %%X is %X, %%#X is %#X\n", i,i,i,i);
		System.out.printf("%%d is %d\n", i);
	}

	public void test_output2(){
		//long i = 922337203685475807; //error , the value is too big
		long i = 922337203685475807L; //correct, add a postfix "L"

		System.out.printf("%%x is %x, %%#x is %#x, %%X is %X, %%#X is %#X\n", i,i,i,i);
		System.out.printf("%%d is %d\n", i);
	}

	public void test_output3(){
		//float i = 6.6; // error , Java will treat a decimal as a double default
		float i = 6.6f; //correct , add a profix "f"
		System.out.printf("%%.2f is %.2f\n", i);
	}

	public void test_output4(){
		char ch1 = 'a';
		char ch2 = '\u0032';
		System.out.printf("%%c is %c\n", ch1);
		System.out.printf("%%c is %c\n", ch2);
	}

	public void test_convert1(){
		byte b = 10; // occupy 1 byte (8bit)
		int i = 6; // occupy 4 byte
		i = b; //ok
		//b = i; //error
		b = (byte)i; //ok,  force convert...

		float x;
		//x = 10*0.2; //error , because 10 * 0.2 is double type
		x = 10 * 0.2f; //ok
		//x = (float)10*0.2 ; //error    (float)10  * 0.2 is a double type too...
           x = (float)(10*0.2); //ok
		System.out.printf("byte b is %d\n", b);


		System.out.println('a');
		System.out.println('a'+1);
		System.out.println(""+'a'+1);

	}
}
