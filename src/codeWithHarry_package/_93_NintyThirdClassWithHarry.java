package codeWithHarry_package;
import java.util.*;


public class _93_NintyThirdClassWithHarry {

	public static void main(String[] args) {
		System.out.println("ArrayDeque!!");
		/*
		 	It's similar to the array list. It has some extra method which array list doesn't have. It has some method also which can throw exception.
		 	It's basically a queue which is double ended.
		 	In a queue we add element in the last and remove element from the first.
		 	But in Dequeue we can add and remove from the both ends of the list.
		 */
		
		ArrayDeque<Integer> d1 = new ArrayDeque<>();
		d1.add(6);
		d1.add(56);
		d1.add(9);
		d1.addFirst(5);
		System.out.println(d1.getFirst());
		System.out.println(d1.getLast());
		

	}

}
