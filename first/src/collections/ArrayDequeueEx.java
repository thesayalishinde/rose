package collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class ArrayDequeueEx {

	public static void main(String[] args) {

		Deque<String> stck = new ArrayDeque<String>();
		stck.add("Kaz");
		stck.add("Inej");
		System.out.println("Original Deque: " + stck);
		stck.push("Nina");
		stck.push("Jesper");
		System.out.println("Elements pushed on stack: " + stck);
		System.out.println("Pop an elem: " + stck.pop());

		Deque<String> que = new ArrayDeque<String>();
		que.add("Rose");
		que.add("Lily");
		System.out.println("Original Deque: " + que);
		que.offer("Matt");
		que.offer("Kaz");
		que.offerFirst("Joost");
		que.offerLast("Anya");
		System.out.println("Elements pushed in Queue: " + que);
		System.out.println("Pop an elem: " + que.peek());

		Deque<String> dq = new ArrayDeque<String>();
		dq.add("Kaz");
		dq.add("Inej");
		dq.add("Jesper");
		dq.add("Nina");
		dq.add("Wylan");
		dq.addFirst("Matt");
		dq.addLast("Joost");
		System.out.println("Original Deque: " + dq);
		System.out.println(dq.contains("Jesper"));
		System.out.println(dq.element());
		System.out.println(dq.equals(que));
		System.out.println(dq.peek());
		System.out.println(dq.poll());
		System.out.println(dq);
		dq.remove();
		System.out.println(dq);

		Iterator<String> t = dq.iterator();
		while (t.hasNext())
			System.out.println(t.next());
		
		
		System.out.println();
		
		Iterator<String> i = dq.descendingIterator();
		while (i.hasNext())
			System.out.println(i.next());

	}

}
