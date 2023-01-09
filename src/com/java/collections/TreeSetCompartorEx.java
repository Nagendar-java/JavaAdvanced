package src.com.java.collections;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetCompartorEx {
public static void main(String[] args) {
		
		/*
		 * TreeSet<User> tset= new TreeSet<>(Comparator.comparing(User::getLastName));
		 * tset.add(new User(1, "Nag", "AR"));
		 * tset.stream().collect(Collectors.toList()).forEach(System.out::println);
		 * tset.forEach(System.out::println);
		 */
		
		TreeSet<User> studentList = new TreeSet<User>(Comparator.comparing(User::getFirstName));
        studentList.add(new User(29, "Mills", "Tom"));
        studentList.add(new User(25, "Zuckerberg", "Mark"));
        studentList.add(new User(35, "Bernard", "John"));

        Iterator<User> studentIterator = studentList.iterator();
        while(studentIterator.hasNext()) {
            System.out.println(studentIterator.next());
	}}
}
