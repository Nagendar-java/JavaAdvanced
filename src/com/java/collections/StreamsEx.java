package src.com.java.collections;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class StreamsEx {
	public static void main(String[] args) {
		List<String> myList= Arrays.asList("kjl", "","abc","pqr","","efg","xyz");
		List<Integer> number= Arrays.asList(1,2,3,3,4,5,6,67,78,78,78,89,89,90,909,909);
		
		long Count= myList.stream().filter(a -> a.isEmpty()).count();
		System.out.println("Empty String count is: "+Count);
		
		Long length= myList.stream().filter(a -> a.length()==3).count();
		System.out.println("Lenth of the strinsg are: "+length);
		
		List<String> filteredList= myList.stream().filter(a -> !a.isEmpty()).collect(Collectors.toList());
		System.out.println("Filtered List: "+ filteredList);
		
		String mergedString= myList.stream().filter(a -> !a.isEmpty()).collect(Collectors.joining(","));
		System.out.println("Merged String is: "+ mergedString);
		
		List<Integer> num= number.stream().map(i -> i*i).distinct().collect(Collectors.toList());
		System.out.println("map ex: "+ num);
		
		//random number is 
		
	 new Random().ints(10, 1, 9).forEach(System.out::println);;

		
	}
}
