package src.com.java.algorthams;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class GreedyAlgorithamEx {
	public static void main(String[] args) {
		
	
	
	List<Integer> list1= Arrays.asList(1,2,3,4,5,6,7,89,0,9,9,89,90,90,99);
	List<Integer> list2= Arrays.asList(1,2,3,4,5,67,8,9,0,11,12,23,23);
	List<Integer> list3= Arrays.asList(9,8,7,6,5,4,3,2,1);
	List<List<Integer>> listOfLists= Arrays.asList(list1,list2,list3);
	
	listOfLists.stream().flatMap(Collection :: stream).collect(Collectors.toSet()).forEach(System.out::println);
	
//	listOfLists.stream().flatMap(x->x.stream()).distinct().collect(Collectors.toList()).forEach(System.out::println);
	
	}
}
