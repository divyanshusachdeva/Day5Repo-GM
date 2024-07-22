package com.graymatter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class DemoOnArrayList {

	public static void main(String[] args) {

		ArrayList alist = new ArrayList();
		alist.add(56);
		alist.add("Divyanshu");
		alist.add(45.67);
		alist.add(true);
		
		System.out.println(alist); // follows insertion order
		
		alist.add(56);
		alist.add(45.67);
		
		System.out.println(alist); // allows duplicate values
		
		alist.add(null);
		alist.add("Divyanshu");
		
		System.out.println(alist); // null value can be added
		
		
		for(int i = 0 ; i < alist.size() ; i++) {
			System.out.println(alist.get(i)); // can print like this as well			
		}
		
		
		ArrayList<Integer> list = new ArrayList<Integer>(); // Only integer values can be put in this Array List
		list.add(89);
		list.add(67);
		list.add(56);
		list.add(34);
		
		for (int i : list)
			System.out.println(i);
		
		
		list.add(2, 121); // 121 will be placed at the 2nd position and the rest of the data will shift
		System.out.println(list);
		
		
		list.addAll(3, alist); // alist will be added in the list from 3rd index. Though list was of Integer type, the alist got added
		System.out.println(list);
		
		//Array list is resizable
		// The initial capacity of Array List is 10. If array List capacity gets exhausted, then the capacity increases by 5 every time.
		
		list.remove(0); // For removing, the index needs to be provided instead of the element
		System.out.println(list);
		
		System.out.println(list.contains("Divyanshu"));
		
		
		alist.remove("Divyanshu"); // it will remove the first occurrence of the object
		System.out.println(alist);
		
		list.remove((Integer)121);
		System.out.println(list);
		

		list.clear();
		
		list.add(89);
		list.add(67);
		list.add(45);
		list.add(33);
		System.out.println(list);

		
		System.out.println("Using Iterator");
		
		Iterator<Integer> itr = list.iterator();
		while (itr.hasNext()) {
			int i = itr.next();
			if(i==45)
				itr.remove(); // there is no ad method in iterator but is there in List iterator
			System.out.println(i);
		}
			System.out.println(itr);
		
		
		System.out.println("Using List Iterator");
		
		ListIterator<Integer> listItr = list.listIterator();
		System.out.println("Elements print in forward direction: ");
		
		while (listItr.hasNext()) {
			
			int i = listItr.next();
			
			if(i==45)
				listItr.add(145);
			System.out.println(i);
			
			
		}
			
		
		System.out.println("Elements print in backward direction: ");
		
		while (listItr.hasPrevious())
			System.out.println(listItr.previous());
		
		
		list.add(66);
		list.add(23);
		list.add(90);
		System.out.println(list);
		
		Collections.sort(list); // sorting the list
		System.out.println(list);
		
		
		
	}

}
