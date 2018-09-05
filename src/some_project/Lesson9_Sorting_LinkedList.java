package some_project;

import java.util.*;

public class Lesson9_Sorting_LinkedList {

	public static void Lesson9(String[] args) 
	{
		Integer[] numbers = {33,77,11,44,5,88,22,66};
		List<Integer> list = Arrays.asList(numbers);
		
		Collections.sort(list);
		System.out.printf("%s\n", list);
		
		Collections.sort(list, Collections.reverseOrder());
		System.out.printf("%s\n", list);
	}

}
