package src.com.java.java8;

import java.util.Collections;
import java.util.TreeSet;

public class PrimeNumberSort {
public static void main(String[] args) {
		
		TreeSet<Integer> treeset=new TreeSet<Integer>(Collections.reverseOrder());
        treeset.add(3);
        treeset.add(5);
        treeset.add(13);
        treeset.add(11);
        treeset.add(13);
        treeset.add(13);
        treeset.forEach(System.out::println);
      //  treeset.stream().sorted().collect(Collectors.toList()).forEach(System.out::println);
        
		/*
		 * Iterator<Integer> itr=treeset.iterator(); while (itr.hasNext()) {
		 * System.out.println(itr.next());
		 * 
		 * }
		 */
	}
}
