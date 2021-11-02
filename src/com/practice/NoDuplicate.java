package com.practice;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class NoDuplicate<T> {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> num = new ArrayList<Integer>();
		num.add(1);
		num.add(5);
		num.add(1);
		num.add(2);		
		num.add(4);
		num.add(5);
		num.add(2);
		NoDuplicate<Integer> obj = new NoDuplicate<Integer>();
		obj.removeDup(num);
	}
	public void removeDup(List<T> num) {
		System.out.println("List with duplicates "+num);
		Set<T> noDup = new LinkedHashSet<T>(num);
		num.clear();
		num.addAll(noDup);
		System.out.println("List with no duplicates "+num);
	}
}
