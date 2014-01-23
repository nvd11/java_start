package Object_kng.Poly_kng;

class Human_3{
	private int id;
	private String name;	

	public Human_3(int id,String name){
		this.id = id;
		this.name = name;	
	}	

	public String get_mem(){
		return "Human: " + id + "  " +  name;
	}
}

class Student_3 extends Human_3{
	public Student_3(int id, String name){
		super(id,name);	
	}

	public String get_mem(){
		return "student: " + super.get_mem();
	}
}



class Section_monitor_3 extends Student_3{
	public Section_monitor_3(int id, String name){
		super(id,name);	
	}

	public String get_mem(){
		return "section_monitor: " + super.get_mem();
	}
}

public class Poly_3{
	public static String extend_mem(Human_3 hm){
		java.util.Date now = new java.util.Date();
		java.text.DateFormat d1 = java.text.DateFormat.getDateInstance();
						
		return d1.format(now) + ": " + hm.get_mem();	
	}

	public static void print(){
		Human_3 hm = new Human_3(1,"Jack");
		Student_3 st = new Student_3(2,"Dick");
		Section_monitor_3 sm = new Section_monitor_3(3,"Cindy");	

		System.out.printf("%s\n",extend_mem(hm));
		System.out.printf("%s\n",extend_mem(st));
		System.out.printf("%s\n",extend_mem(sm));

	}
}
