package some_project;

public class Lesson2_Strings {

	public static void Lesson2(String[] args) {
		String s = "азадеревомдеревоазадеревомлес";
		
		System.out.println(s.indexOf("д"));
		System.out.println(s.indexOf("дер"));
		System.out.println(s.indexOf("дер", 14));
		
		String a = "Енот ";
		String b = "полоскун";
		System.out.println(a + b);
		System.out.println(a.concat(b));
		System.out.println(a.replace("т", "Д"));
		System.out.println(b.toUpperCase());
		
		String c = "     крендель     ";
		System.out.println(c);
		System.out.println(c.trim());
	}

}
