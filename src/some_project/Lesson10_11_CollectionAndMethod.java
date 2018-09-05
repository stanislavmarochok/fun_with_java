package some_project;

import java.util.*;

public class Lesson10_11_CollectionAndMethod {

	public static void main(String[] args) {
		Character[] c = {'n','e','r','d'};
		List<Character> list = new ArrayList(Arrays.asList(c));
		
		System.out.println("Наш список: ");
		
		output(list);
		
		Collections.reverse(list);
		System.out.println("Наш список в обратном порядке: ");
		output(list);
		
		Character[] newChar = new Character[list.size()];
		List<Character> listCopy = new ArrayList(Arrays.asList(newChar));
		
		Collections.copy(listCopy, list);
		System.out.println("Копия список: ");
		output(listCopy);
		
		Collections.fill(listCopy,  'O');
		output(listCopy);
		
		delete (list, 2);
		output(list);
	}
	
	private static void output(List<Character> list)
	{
		for (Character c: list)
		{
			System.out.printf("%c ", c);
		}
		System.out.printf("\n");
	}
	
	private static void delete (List<Character> list, int element)
	{
		list.remove(element);
	}
}
