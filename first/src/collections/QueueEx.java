package collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {
	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();

		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);

		System.out.println("Elements of queue " + q);
    	q.remove();
		System.out.println(q);
		System.out.println("Peek: " + q.peek());
		q.offer(7);
		System.out.println(q);
		System.out.println(q.element());
		System.out.println(q);
		System.out.println(q.poll());
		System.out.println(q);
	}
}
