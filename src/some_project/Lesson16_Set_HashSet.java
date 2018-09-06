package some_project;

import java.util.*;

public class Lesson16_Set_HashSet {

	public static void Lesson16(String[] args) {
		String[] brand = {"Intel", "Dell", "Apple", "IBM", "LG", "Dell"};
		List<String> brandList = Arrays.asList(brand);
		
		System.out.printf("%s \n", brandList);
		Set<String> set = new HashSet<String>(brandList);
		System.out.printf("%s \n", set);
	}

}
