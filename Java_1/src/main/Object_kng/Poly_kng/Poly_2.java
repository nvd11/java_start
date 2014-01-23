package Object_kng.Poly_kng;

class Human_2{
	public void print(){
		System.out.printf("it's Human\n");
	}
}

class Student_2 extends Human_2{
	public void print(){
		System.out.printf("it's Student\n");
	}
}

class Section_monitor_2 extends Student_2{
	public void print(){
		System.out.printf("it's Section_monitor\n");
	}
}

public class Poly_2{
	public static void f(){
		Human_2 hm = new Human_2();
		Student_2 st = new Student_2();
		Section_monitor_2 sm = new Section_monitor_2();

		hm.print();
		hm = st;
		hm.print();
		hm = sm;
		hm.print();
	}
}