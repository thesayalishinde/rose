package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import ioexamples.Employee;

public class arraylistEx {
	public static void main(String[] args) {

		ArrayList<Integer> arli = new ArrayList<Integer>();
		ArrayList<Employee> em = new ArrayList<>();
		Employee e = new Employee();
		Employee ee = new Employee();
		Employee eee = new Employee();

		e.setName("Robert");
		e.setYoj(1997);
		e.setAddress("D walls street");
		e.setSalary(200);

		ee.setName("Sam");
		ee.setYoj(1977);
		ee.setAddress("R walls street");
		ee.setSalary(500);

		eee.setName("John");
		eee.setYoj(1997);
		eee.setAddress("S walls street");
		eee.setSalary(400);

		em.add(e);
		em.add(ee);
		em.add(eee);

		// for (int i = 0; i < em.size(); i++) {
		// System.out.println(em.get(i));
		// }
		System.out.println(em);

		arli.add(1);
		arli.add(5);
		arli.add(2);
		arli.add(9);

		System.out.println(arli);
		Collections.sort(arli);
		System.out.println(arli);
		arli.remove(2);
		System.out.println(arli);
		System.out.println(arli.contains(9));
		System.out.println(arli.indexOf(9));
		System.out.println(arli.size());

		for (int i = 0; i < arli.size(); i++) {
			System.out.println(arli.get(i));
		}

		Iterator<Employee> i = em.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		;

		String[] rats = { "Inej", "kaz", "Jesper" };
		List al = Arrays.asList(rats);
		System.out.println(al);
		System.out.println(al.size());

		/*
		 * Object[] objects = arli.toArray();
		 * 
		 * for (Object obj : objects) System.out.print(obj + " ");
		 */
		Integer[] arr = new Integer[arli.size()];
		arr = arli.toArray(arr);

		for (Integer x : arr)
			System.out.print(x + " ");
	}

}
