package some_project;

import java.util.*;

public class Lesson5_ArrayList {

	public static void Lesson5(String[] args) {
		String[] antiHeroes = {"Joker", "Grinch", "Plankton", "Mistique"};
		List<String> list1 = new ArrayList<String>();
		
		//Добавление элементов массива в список
		for (String x: antiHeroes)
		{
			list1.add(x);
		}
		
		String[] moreAntiheroes = {"Joker", "Mistique"};
		List<String> list2 = new ArrayList<String>();
		for (String x: moreAntiheroes)
		{
			list2.add(x);
			list1.add(x);
		}
		
		for (int i = 0; i < list2.size(); i++)
		{
			System.out.printf("Список 2 - %s \n", list2.get(i));
		}
		
		for (int i = 0; i < list1.size(); i++)
		{
			System.out.printf("Список 1 - %s \n", list1.get(i));
		}
		
		editList(list1, list2);
		System.out.println();
		
		for (int i = 0; i < list1.size(); i++)
		{
			System.out.printf("Список 1 - %s \n", list1.get(i));
		}
	}
	
	public static void editList(Collection<String> list1, Collection<String> list2)
	{
		Iterator<String> iterator = list1.iterator();
		while (iterator.hasNext())
		{
			if (list2.contains(iterator.next()))
			{
				iterator.remove();
			}
		}
	}

}
