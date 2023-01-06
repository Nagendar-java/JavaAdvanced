package src.com.java.java8;

import java.util.ArrayList;
import java.util.List;

public class ForEachEx {
public static void main(String[] args) {
		
		List<String> myList= new ArrayList<String>();
		myList.add("sujatha");
		myList.add("SS");
		myList.add("KK");
		myList.forEach(n -> System.out.println(n));
		//or method reference
		//MR is the replacement of Lambda
		myList.forEach(System.out::println);
	}
}
