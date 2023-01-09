package src.com.java.collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class DQueEx {
	public static void main(String[] args) {
		//Deque quee= new Deque<>();
		
		
		//add elements from both ends
		//queue has only fifo
		Deque<String> dq=new ArrayDeque<String>();
		dq.add("a");//String
		dq.add("b");//String
		dq.poll();
		
		Deque<Integer> dq1=new ArrayDeque<Integer>();
		dq1.add(1);
		dq1.add(2);
		
		
		//for-each
		for(String str:dq) {
			System.out.println(str);
		}
	}
}
