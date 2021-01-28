package Map;

import java.util.HashMap;
import java.util.Map;
import ioexamples.Employee;

public class HashMapEx {

	static Map<Integer, Employee> l;

	public Employee getDetails(Integer key) {
		Employee e = l.get(key);

		return e;

	}

	public static void main(String[] args) {
		l = new HashMap<>();

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

		
		l.put(1, e);
		l.put(2, ee);
		l.put(3, eee);

		System.out.println(l);

		for (Map.Entry<Integer, Employee> eh : l.entrySet()) {
			Integer key = eh.getKey();
			Employee value = eh.getValue();
			System.out.println(key + " : " + value);
		}

		System.out.println(l.get(1));

		HashMapEx hp = new HashMapEx();
		Employee E1 = hp.getDetails(1);
		System.out.println(E1);

	}
}
