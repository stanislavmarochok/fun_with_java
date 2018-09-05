package some_project;

import java.util.Arrays;
import java.util.LinkedList;

public class Lesson8_LinkedList_to_Array {

	public static void Lesson8(String[] args) {
		String[] PulpFiction = {"Mia", "Julls", "Vincent", "Marcellas", "Butch"};
		LinkedList<String> list = new LinkedList<String>(Arrays.asList(PulpFiction));
		
		list.add("Cuns");
		list.addFirst("Vinston");
		
		PulpFiction = list.toArray(new String[list.size()]);
		for (String s: PulpFiction)
			System.out.printf("%s \n", s);
	}

}
