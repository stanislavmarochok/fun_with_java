package some_project;

import java.util.*;

public class Lesson15_Queue {

	public static void Lesson15(String[] args) {
		PriorityQueue<Integer> q = new PriorityQueue<Integer>();
		q.offer(1);
		q.offer(2);
		q.offer(3);
		System.out.printf("%s \n", q);
		System.out.printf("%s \n", q.peek());
		q.poll();
		System.out.printf("%s \n", q);
		
		q.offer(12);
		q.offer(34);
		q.offer(9);
		System.out.printf("%s \n", q);
		System.out.printf("%s \n", q.size());
	}

}
