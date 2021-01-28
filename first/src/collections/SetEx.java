package collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;


public class SetEx {
	public static void main(String[] args) {
		Set<String> s = new HashSet<String>();
		s.add("Kaz");
		s.add("Inej");
		s.add("Jesper");
		s.add("Nina");
		s.add("Wylan");

		System.out.println(s);
		System.out.println("Contains " + s.contains("Kaz"));
		s.remove("Jesper");
		System.out.println(s);

		for (String e : s) {
			System.out.print(e + " ");
		}

		Set<String> s1 = new HashSet<String>();
		s1.add("Kaz");
		s1.add("Inej");
		s1.add("Nina");
		s1.addAll(s);
		System.out.println();
		System.out.println("union" + s1);
		s1.retainAll(s);
		System.out.println("Intersection" + s1);
		s1.removeAll(s);
		System.out.println("Difference" + s1);

		Set<Integer> treeS = new TreeSet<Integer>();
		treeS.add(1);
		treeS.add(6);
		treeS.add(7);
		treeS.add(4);
		treeS.add(3);
		
		System.out.println(treeS);
		int x = ((TreeSet<Integer>) treeS).ceiling(5);
		System.out.println(x);
		System.out.println(((TreeSet<Integer>) treeS).first());
		
		
		

	}

}
