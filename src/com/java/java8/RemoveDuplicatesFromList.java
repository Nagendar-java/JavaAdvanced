package src.com.java.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromList {

	public static void main(String[] args) {
		List<Integer> myList= Arrays.asList(1,2,2,3,4,4,5,6,7,7,8,12);
	//	myList.stream().collect(Collectors.toSet()).forEach(System.out::println);
		myList.stream().distinct().collect(Collectors.toList()).forEach(System.out::println);
	}
}
