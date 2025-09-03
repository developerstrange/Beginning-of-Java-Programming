package codeWithHarry_package;

import java.util.*;

public class _91_NintyFirstClassWithHarry {

	public static void main(String[] args) {
		System.out.println("ArrayList!!");
		ArrayList<Integer> l1 = new ArrayList<>();
		ArrayList<Integer> l2 = new ArrayList<>();
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
		l1.addLast(2);
		
		System.out.println(l1.contains(5));
		System.out.println(l1.lastIndexOf(5));
		System.out.println(l1.indexOf(5));
		
		//l1.clear();
		
		for(int element: l1) {
			System.out.print(element + " ");
		}

	}

}
