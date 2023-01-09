package src.com.java.java8;

import java.util.function.Predicate;

//return boolean value, data validation
public class FIPredicateEx {

	public static void main(String[] args) {
		
		Predicate<Integer> lesserThan= i -> (i<=18);
		System.out.println(lesserThan.test(18));
		
		
	}
}
