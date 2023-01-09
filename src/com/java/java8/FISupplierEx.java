package src.com.java.java8;

import java.time.LocalDateTime;
import java.util.function.Supplier;

public class FISupplierEx {
public static void main(String[] args) {
		
		Supplier<Double> randomValue= () -> Math.random();
		System.out.println(randomValue.get());
		
		Supplier<LocalDateTime> t= () -> LocalDateTime.now();
		LocalDateTime presentime= t.get();
		System.out.println(presentime);
	}
}
