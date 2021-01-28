package java8;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class LambdaImple {

	public static void main(String[] args) {

		// FunctionaInterfEx f = (grt) -> System.out.println(grt);
		// f.greet("Good Morning");
		//FunctionalInter2 f = (a) -> a + 1;
		//System.out.println(f.incree(7));
		//FunctionalInter2 f = (a,b,c) -> a+b+c;
		//System.out.println(f.add(7,6,4));
		//FunctionalInter2 f = (a,b) -> a.concat(b);
		//System.out.println(f.Concatex("hey"," hello"));
		
		//Predicate<String> p = (n) -> n.startsWith("K");
		//System.out.println(p.test("Kaz"));
		
		BiPredicate<String, Integer> p = (x, y) -> {
            return x.length() == y;
        };

        boolean result = p.test("mkyong", 6);
        System.out.println(result);  

        boolean result2 = p.test("java", 10);
        System.out.println(result2);
		
        
		
		
		
	}
}
