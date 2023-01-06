package src.com.java.java8;

import java.util.function.Function;

public class FIFunctionEx {
	
	public static void main(String[] args) {
		
		//Integer is primary and Double is Temporary like primary key and foriegn key
		//it should be same type link number(int, double) we can not give Int and string
		Function<Integer, Double> half= a -> a/2.0;
		System.out.println(half.apply(93));
	}

}