package some_project;

public class Lesson1_Strings {

	public static void Lesson1(String[] args) {
		String[] food = {"�������", "��������", "�����", "�����", "������"};
		for (String s: food)
		{
			System.out.println(s);
		}
		
		for (String s: food)
		{
			if (s.startsWith("��"))
				System.out.println(s + " ���������� � ��");
		}
		
		for (String s: food)
		{
			if (s.endsWith("��"))
				System.out.println(s + " ������������� �� ��");
		}
	}

}
