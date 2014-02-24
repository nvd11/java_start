package Object_kng.Object_baseMethod;

public class Ob_equals_5{
	public static void f(){
		String s1 = "abc";
		String s2 = new String("abc");


		System.out.println((s1.equals(s2)));
		System.out.println((s1 == s2));

		s2 = "abcd";
		System.out.println((s2));
	}	
}