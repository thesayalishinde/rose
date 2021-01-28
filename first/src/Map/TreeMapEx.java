package Map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapEx {

	public static void main(String[] args) {

/*		TreeMap<String, String> map = new TreeMap<String, String>();
		map.put("a", "ant");
		map.put("d", "dog");
		map.put("h", "horse");
		SortedMap<String, String> submap;
		submap = map.subMap("b", "g"); // #1 create a backed collection
		System.out.println(map + " " + submap); // #2 show contents
		map.put("b", "bat"); // #3 add to original
		submap.put("f", "fish"); // #4 add to copy
		map.put("r", "raccoon"); // #5 add to original - out of range
		submap.put("p", "pig"); // #6 add to copy - out of range
		System.out.println(map + " " + submap); // #7 show final contents
	*/	
		TreeMap<Integer, String> l = new TreeMap<>();

		l.put(4, "Matt");
		l.put(5, "Wylan");
		l.put(6, "Jesper");
		l.put(1, "Kaz");
		l.put(2, "Inej");
		l.put(3, "Nina");
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
		System.out.println(l.firstKey());
		System.out.println(l.firstEntry());
		System.out.println(l.floorEntry(4));
		System.out.println(l.floorKey(4));
		System.out.println(l.isEmpty());
		System.out.println(l.subMap(3,6));
		System.out.println(l.ceilingEntry(4));
		System.out.println(l.ceilingKey(4));
		System.out.println(l.comparator());
		System.out.println(l.descendingKeySet());
		System.out.println(l.descendingMap());
		System.out.println(l.headMap(4));
		System.out.println(l.headMap(4, true));
		System.out.println(l.higherEntry(4));
		System.out.println(l.higherKey(4));
		System.out.println(l.lowerEntry(4));
		System.out.println(l.lowerKey(4));
		System.out.println(l.navigableKeySet());
		System.out.println(l.pollFirstEntry());
		System.out.println(l.pollLastEntry());
		System.out.println(l.subMap(3, true, 6, true));
		System.out.println(l.tailMap(4));
		System.out.println(l.tailMap(4, false));

		for (Map.Entry<Integer, String> e : l.entrySet()) {
			Integer key = e.getKey();
			String value = e.getValue();
			System.out.println(key + " : " + value);
		}

	}

}
