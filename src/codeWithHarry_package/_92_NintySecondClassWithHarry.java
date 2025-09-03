package codeWithHarry_package;
import java.util.*;

public class _92_NintySecondClassWithHarry {

	public static void main(String[] args) {
		System.out.println("Linked List!!");
		/*
		 	Array list and linked list both are nearly same. But there are a basic difference. 
		 	Linked list works with node and the reference value where Array list works with index.
		 	It's easy and fast to find a value in a ArrayList instead of Linked List.
		 	But it's easy to insert and delete value in last, first or middle in Linked List instead of ArrayList.
		 	So both of them has their specific advantages and disadvantages.
		 */
		
		LinkedList<Integer> l1 = new LinkedList<>();
		LinkedList<Integer> l2 = new LinkedList<>();
		l2.add(44);
		l2.add(87);
		l2.add(55);
		l1.add(5);
		l1.add(4);
		l1.add(1);
		l1.add(7);
		l1.add(5);
		l1.addAll(0,l2);
		l1.add(0, 3);
		l1.addLast(44);
		l1.addFirst(42);
		
		System.out.println(l1.contains(5));
		System.out.println(l1.lastIndexOf(5));
		System.out.println(l1.indexOf(5));
		
		
		for(int element: l1) {
			System.out.print(element + " ");
		}

	}

}
