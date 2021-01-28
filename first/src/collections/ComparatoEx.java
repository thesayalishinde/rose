package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import ioexamples.Employee;

public class ComparatoEx implements Comparator<Employee> {

	
	public static void main(String[] args) {
		ArrayList<Employee> em = new ArrayList<>();
		Employee e = new Employee();
		Employee ee = new Employee();
		Employee eee = new Employee();
		
		e.setName("Robert");
		e.setYoj(1997);
		e.setAddress("D walls street");
		e.setSalary(200);

		ee.setName("Sam");
		ee.setYoj(1978);
		ee.setAddress("R walls street");
		ee.setSalary(500);

		eee.setName("John");
		eee.setYoj(1992);
		eee.setAddress("S walls street");
		eee.setSalary(400);

		em.add(e);
		em.add(ee);
		em.add(eee);

		System.out.println("Before :"+em);
		
		Collections.sort(em, new ComparatoEx() );
		System.out.println("After :"+em);
		
		Collections.sort(em, new Employee() );
		System.out.println("After :"+em);
		
	}

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return o1.getName().compareTo(o2.getName());
	}
	

}
