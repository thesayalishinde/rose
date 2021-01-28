package java8;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsEx {
	public static void main(String[] args) {
		List<String> l = new ArrayList<String>();

		l.add("Kaz");
		l.add("Inej");
		l.add("Jesper");
		l.add("Nina");
		l.add("Kazz");
		l.add("Wylan");
		l.add("Matt");
		l.add("Kazz");
		l.add("Joost");
		l.forEach(crows->System.out.println(crows));
		System.out.println();
		
		l.stream().filter((s) -> s.startsWith("K")).sorted().distinct().forEach(crows->System.out.println(crows));
		System.out.println();
		
		long c= l.stream().filter((s) ->s.endsWith("z")).count();
		System.out.println(c);
		System.out.println();
		
		l.stream().map((s)->s.toUpperCase()).forEach(crows->System.out.println(crows));
		System.out.println();
		
		boolean b = l.stream().allMatch((s)-> s.startsWith("K"));
		System.out.println(b);
		
		boolean b2 = l.stream().anyMatch((s)-> s.startsWith("K"));
		System.out.println(b2);
		
		boolean b3 = l.stream().noneMatch((s)-> s.startsWith("u"));
		System.out.println(b3);
		
		List<Integer > l1 = Arrays.asList(0,1,2,3,4,5,6,7,8,9,10);
		l1.stream().filter((s) -> s % 2 == 0).forEach(crows->System.out.println(crows));
		
		l.stream().flatMap((s)->Stream.of(s.charAt(2))).forEach(crows->System.out.println(crows));
		
		
		
	}
}
