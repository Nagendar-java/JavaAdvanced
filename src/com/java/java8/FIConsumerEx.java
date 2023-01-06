package src.com.java.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

//Consumer FI is to implement functional programming in Java. 
//It represents a function which takes in one argument and produces a result.
//accept

/* Syntax is
* void accept(T t)
*/
public class FIConsumerEx {

	public static void main(String[] args) {

		// Consumner to display number
		Consumer<Integer> display = b -> System.out.println(b);
		// implement display using accept()
		display.accept(20);
		// System.out.println(display);

		// Consumer multiply 2 to every Integer of a list

		Consumer<List<Integer>> disp = list -> {
			for (int i = 0; i < list.size(); i++) {
				list.set(i, 2 * list.get(i));
			}

		};
		// System.out.println(disp);

		// consumer to display the list of numbers
		Consumer<List<Integer>> dispList = list -> list.stream().forEach(a -> System.out.println(a + " "));

		List<Integer> list = new ArrayList<>();

		list.add(2);
		list.add(3);
		list.add(4);

		disp.accept(list);
		dispList.accept(list);

		// accept null type

	}

}
