package Map;

import java.util.Hashtable;
import java.util.Map;

public class HashTableEx {
	public static void main(String[] args) {
		Map<Integer, String> l = new Hashtable<>();

		l.put(1, "Kaz");
		l.put(2, "Inej");
		l.put(3, "Nina");
		l.put(4, "Matt");
		l.put(5, "Wylan");
		l.put(6, "Jesper");
		System.out.println(l);
		
		l.put(2, "Rose");
		System.out.println(l);
		
		l.remove(2);
		System.out.println(l);
		
		l.replace(3, "Inej");
		System.out.println(l);
		
		System.out.println(l.containsKey(3));
		System.out.println(l.containsValue("Kaz"));
		System.out.println(l.keySet());
		System.out.println(l.values());
		
		l.compute(1,(key, val)->val.concat(" Brekker"));
		System.out.println(l);

		System.out.println(l.isEmpty());
		
		
		for (Map.Entry<Integer, String> e : l.entrySet()) {
			Integer key = e.getKey();
			String value = e.getValue();
			System.out.println(key + " : " + value);
		}
		
		
	}
}
