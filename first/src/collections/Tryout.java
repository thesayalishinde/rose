package collections;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NavigableSet;
import java.util.Queue;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArrayList;

public class Tryout {

	static void printNames(List<String> list) {
		for (int i = 0; i < list.size(); i++) {
			String name = (String) list.get(i);
			System.out.println(name);
		}
	}

	public static void main(String[] args) {

		// Q 8

		NavigableSet<Integer> set = new TreeSet<>();
		for (int i = 1; i <= 20; i++)
			set.add(i);
		System.out.println(set.lower(10));
		System.out.println(set.floor(10));
		System.out.println(set.ceiling(20));
		System.out.println(set.higher(20));

		System.out.println();
		// Q 9
		Queue<Integer> queue = new ArrayDeque<>();
		System.out.println(queue.offer(10));
		System.out.println(queue.offer(4));
		System.out.println(queue.peek());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.peek());

		System.out.println();
		// Q.10

		String[] rats = { "Inej", "kaz", "Jesper", "Anya" };

		List<String> lst = Collections.synchronizedList(new ArrayList<String>());
		lst.addAll(Arrays.asList(rats));

		ListIterator<String> f = lst.listIterator();
		System.out.println("backward iteration");
		while (f.hasPrevious()) {
			System.out.println("index= " + f.previousIndex() + "value=" + f.previous());
		}
		
		synchronized (lst) {
			Iterator<String> i = lst.iterator();
			while (i.hasNext())
				System.out.println(i.next());

		}

		System.out.println();

		CopyOnWriteArrayList<String> SyncList = new CopyOnWriteArrayList<String>();
		SyncList.addAll(Arrays.asList(rats));
		Iterator<String> i = SyncList.iterator();
		while (i.hasNext())
			System.out.println(i.next());

		// Q 11

		List<Integer> li = Arrays.asList(9, 7, 5, 3);
		Collections.sort(li);// [3,5,7,9]
		System.out.println(li);
		System.out.println(Collections.binarySearch(li, 3));
		System.out.println(Collections.binarySearch(li, 2));
		System.out.println();

		// Q 12
		// Convert and store StringBuilder to String type using toString()
		// Add Builder Generic to List Interface and ArrayList Class

		List<String> names = new ArrayList<String>();
		StringBuilder s1 = new StringBuilder("Webby");
		String str = s1.toString();
		names.add(str);
		printNames(names);

		// Q 13
		List<Integer> copy = new ArrayList<Integer>(li);
		System.out.println(copy);
		System.out.println();

		// Q14
		copy.set(1, 9);
		System.out.println(copy);
		System.out.println();

		// Q 16
		Iterator<Integer> e;
		e = li.listIterator();
		while (e.hasNext()) {
			System.out.println(e.next());
		}

		
		

		// Q 17

	}
}
