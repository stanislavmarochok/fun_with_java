package some_project;

public class Lesson1_Strings {

	public static void main(String[] args) {
		String[] food = {"�������", "��������", "�����", "�����", "������"};
		for (String s: food)
		{
			System.out.println(s);
		}
		
		for (String s: food)
		{
			if (s.startsWith("��"))
				System.out.println(s + "���������� � ��");
		}
	}

}
