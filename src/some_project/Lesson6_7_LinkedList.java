package some_project;

import java.util.*;

public class Lesson6_7_LinkedList {

	public static void Lesson6_7(String[] args) {
		String[] zveri1 = {"кот", "пингвин", "волк", "ежик", "дракон"};
		List<String> list1 = new LinkedList<String>();
		for (String x: zveri1)
			list1.add(x);
		String[] zveri2 = {"удав", "волк", "ёжик", "ниблер"};
		List<String> list2 = new LinkedList<String>();
		for (String x: zveri2)
			list2.add(x);
		list1.addAll(list2);
		list2 = null;
		
		printList(list1);
		removeFromList(list1, 1, 3);
		printList(list1);
		reverseList(list1);
		addJa(list1);
		printList(list1);
	}

	private static void printList (List<String> list)
	{
		for (String x: list)
		{
			System.out.printf("%s\n", x);
		}
		System.out.println();
	}
	private static void removeFromList (List<String> list, int start, int end)
	{
		list.subList(start, end).clear();
	}
	private static void reverseList (List<String> list)
	{
		ListIterator<String> iterator = list.listIterator(list.size());
		while (iterator.hasPrevious())
		{
			System.out.printf("%s ", iterator.previous());
			
		}
		System.out.println();
	}
	private static void addJa (List<String> list)
	{
		String x = "я - ";
		for (String s: list)
			s = x + s;
	}
}
