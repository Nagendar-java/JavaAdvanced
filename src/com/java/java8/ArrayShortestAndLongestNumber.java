package src.com.java.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ArrayShortestAndLongestNumber {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(5, 9, 11, 2, 8, 21, 1);
		int secondSmallestNumber = numbers.stream().sorted(Comparator.naturalOrder()).skip(1).findFirst()
				.get();
		System.out.println(secondSmallestNumber);

		int secondHihestNumber = numbers.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		System.out.println(secondHihestNumber);
		List<Integer> list = new ArrayList<Integer>();
		list.add(secondSmallestNumber);
		list.add(secondHihestNumber);
	}
}
