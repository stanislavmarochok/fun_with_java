package some_project;

public class Lesson2_Strings {

	public static void Lesson2(String[] args) {
		String s = "�����������������������������";
		
		System.out.println(s.indexOf("�"));
		System.out.println(s.indexOf("���"));
		System.out.println(s.indexOf("���", 14));
		
		String a = "���� ";
		String b = "��������";
		System.out.println(a + b);
		System.out.println(a.concat(b));
		System.out.println(a.replace("�", "�"));
		System.out.println(b.toUpperCase());
		
		String c = "     ��������     ";
		System.out.println(c);
		System.out.println(c.trim());
	}

}
