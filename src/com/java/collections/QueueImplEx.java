package src.com.java.collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueImplEx {
	public static void main(String[] args) {
		Queue<Integer> que= new LinkedList<Integer>();
		
		// adds the element to queue
		
		for(int i=0; i<5; i++)
	
			
		System.out.println(que.add(i));
		
		
		//To remove head of the queue
		int removedel= que.remove();
		System.out.println("removed element: "+removedel);
//to view the head of the queue 
		
		int head= que.peek();
		System.out.println("head of the queue is"+ head);
	}

}
