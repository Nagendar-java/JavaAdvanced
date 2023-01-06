package src.com.java.java8;

import java.util.Arrays;
import java.util.List;

public class MR {
	public static void main(String[] args) {
		
	
	List<String> myList= Arrays.asList("test1", "test2", "test3","test1");
	
	myList.stream().sorted().forEach(System.out::println);;
	
	}
	
}
