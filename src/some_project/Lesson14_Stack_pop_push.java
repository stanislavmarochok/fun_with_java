package some_project;

import java.util.*;

public class Lesson14_Stack_pop_push {

	public static void Lesson14(String[] args) {
		Stack<String> stack = new Stack<String>();
		stack.push("�������");
		printStack(stack);
		stack.push("�������");
		printStack(stack);
		stack.push("�����");
		printStack(stack);
		
		stack.pop();
		printStack(stack);
		stack.pop();
		printStack(stack);
		stack.pop();
		printStack(stack);
	}
	private static void printStack(Stack<String> stack)
	{
		if (stack.isEmpty())
			System.out.println("���� ������!");
		else 
			System.out.printf ("%s - ��� ������� ������� �����\n", stack);
		
	}

}
