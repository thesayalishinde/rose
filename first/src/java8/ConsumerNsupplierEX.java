package java8;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class ConsumerNsupplierEX {

	public static void main(String[] args) {
		
		Consumer<String> c = x -> System.out.println(x);
        c.accept("Inej");
        
        BiConsumer<Integer, Integer> Bic = (x, y) -> System.out.println(x + y);
        Bic.accept(1, 2);

        Supplier<String > s = () -> " Hey ";
        System.out.println(s.get());
        
                
	}

}
