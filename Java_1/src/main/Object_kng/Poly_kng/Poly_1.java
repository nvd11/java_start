package Object_kng.Poly_kng;

class Human_1{
	private int id;
	private int name;
}

class Student_1 extends Human_1{
	public String school;
}

class Section_monitor_1 extends Student_1{
	private String subject;
}

public class Poly_1{
	public static void f(){
		Human_1 hm = new Human_1();
		Student_1 st = new Student_1();
		Section_monitor_1 sm = new Section_monitor_1();

		//st = hm;  //error
		//st = (Student_1)hm; //error (can pass the compilation, but will fail in excution)
		//st.school = "aa"; 

		//ok
		hm = st; 	

		//ok
		hm = sm;
		//st = hm;  //error
		st = (Student_1)hm; //ok
	}
}