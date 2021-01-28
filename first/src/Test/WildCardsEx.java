package Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WildCardsEx {
	static double s = 0.0;

	public static double sumOfList(List<? extends Number> list) {

		for (Number n : list)
			s += n.doubleValue();
		return s;
	}

	public static void printList(List<?> list) {
		for (Object elem : list)
			System.out.print(elem + " ");
		System.out.println();
	}

	public static void addNumbers(List<? super Integer> list) {
	    for (int i = 1; i <= 10; i++) {
	        list.add(i);
	    }
	}
	
	public static void main(String[] args) {

		List<Integer> li = Arrays.asList(1, 2, 3);
		printList(li);
		System.out.println("sum = " + sumOfList(li));

		List<Double> ld = Arrays.asList(1.2, 2.3, 3.5);
		printList(ld);
		System.out.println("sum = " + sumOfList(ld));
		
		List<Integer> ll = new ArrayList<>();
		addNumbers(ll);
		printList(ll);
		System.out.println("sum = " + sumOfList(ll));
		
		
	}

}
