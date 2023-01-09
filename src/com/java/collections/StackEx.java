package src.com.java.collections;

import java.util.Stack;
import java.util.stream.Collectors;

public class StackEx {
	public static void main(String[] args) {
		//queue has only LIFO
		//Last in First Out
		Stack<Integer> stk= new Stack<Integer>();
		stk.push(3);
		stk.push(5);
		stk.push(7);
		stk.push(11);
		stk.push(13);
		//stk.pop();
		
		System.out.println(stk.push(1));
		
		//System.out.println(stk.add(2));
		
	System.out.println(stk.pop());
		
		System.out.println(stk.remove(0));
		
		System.out.println("================");
		
		stk.stream().collect(Collectors.toList()).forEach(System.out::println);
		
		/*
		 * Iterator<Integer> itr=stk.iterator(); while (itr.hasNext()) {
		 * System.out.println(itr.next());
		 * 
		 * }
		 */
	}

	
}
