package collections;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;


public class LinkedListEx {

	public static void main(String[] args) {
		LinkedList<String> l
        = new LinkedList<String>();

		l.add("Kaz");
		l.add("Inej");
		l.add("Jesper");
		l.add("Nina");
		l.add("Wylan");
		l.add("Matt");
		l.add("Joost");
		
		
	    
		//Q 15
		l.addLast("Rose");
		
		

    System.out.println(l);

    l.set(4, "pekka");
    System.out.println(l);
    l.remove("Kaz");
    System.out.println(l);
    l.remove(1);
    System.out.println(l);
    l.removeFirst();
    System.out.println(l);
    l.removeLast();
    l.addFirst("Jesperr");
    l.addLast("Job");
    System.out.println(l.element());
    System.out.println(l.peek());
    System.out.println(l);
    System.out.println(l.poll());
    System.out.println(l);
    System.out.println(l.contains("Jesper"));
    System.out.println(l);
    
    Collections.reverse(l);
    Iterator<String> i = l.iterator(); 
    while (i.hasNext()) 
        System.out.println(i.next());
    
	}
	

}
