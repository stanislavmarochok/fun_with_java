package some_project;

public class Lesson3_Recursion {	
	//������� �����
	public static void Lesson3(String[] args) {
		System.out.println(factorial(5));
	}
	
	//��������� � ��������
	public static long factorial (long n)
	{
		if (n <= 1) return 1;
		
		else {
			return n * factorial (n - 1);
		}
	}

}
