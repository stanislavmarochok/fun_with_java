package some_project;

public class Lesson1_Strings {

	public static void main(String[] args) {
		String[] food = {"фенхель", "пармизан", "лапша", "банан", "патока"};
		for (String s: food)
		{
			System.out.println(s);
		}
		
		for (String s: food)
		{
			if (s.startsWith("па"))
				System.out.println(s + "начинается с па");
		}
	}

}
