package some_project;
import java.util.*;

public class Lesson12_13_addAll {

	public static void Lesson12_13(String[] args) {
		String[] planetArray = {"�����", "����", "������", "������"};
		List<String> planetList1 = Arrays.asList(planetArray);
		
		ArrayList<String> planetList2 = new ArrayList<String>();
		planetList2.add("����");
		planetList2.add("��������");
		planetList2.add("������");
		planetList2.add("������");
		
		for (String x: planetList2)
			System.out.printf("%s ", x);
		System.out.println();
		
		Collections.addAll(planetList2, planetArray);
		for (String x: planetList2)
			System.out.printf("%s ", x);
		System.out.println();
		
		planetList2.add("�����");
		System.out.println(Collections.frequency(planetList2, "�����"));
		
		boolean check = Collections.disjoint(planetList1, planetList2);
		System.out.println(check);
			if (check)
				System.out.println("� ���� ������� ��� ������ ������");
			else
				System.out.println("� ���� ������� ���� ����� ��������");
			
			sorting (planetList2);
			output (planetList2);
			bread (planetList2);
			output (planetList2);
	}
	private static void sorting(List<String> list)
	{
		Collections.sort(list);
	}
	private static void output(List<String> list)
	{
		for (String x: list)
			System.out.printf("%s ", x);
		System.out.println();
	}
	private static void bread (List<String> list)
	{
		Collections.shuffle(list);
	}

}
