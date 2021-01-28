package java8;

import java.util.function.Function;
import java.util.function.BiFunction;

public class FunctionEx {

	public static void main(String[] args) {
		Function<String, Integer> f1 = x -> x.length();
		Integer apply = f1.apply("Sayali");
		System.out.println(apply);
		
		//Function<Integer, Integer> f2 = x -> x * 2;
        //Integer result = f1.andThen(f2).apply("Inej");   
        //System.out.println(result);

        Function<Integer, Integer> f2 = x -> x * 2;
        Integer result = f2.compose(f1).apply("Inej");   
        System.out.println(result);
        System.out.println(Function.identity());
        
        BiFunction<String, String, Integer> bf1 = (x1,x2) -> (x1.concat(x2).length());
		Integer bapply = bf1.apply("Sayali"," Shinde");
		System.out.println(bapply);
		
	}

}
