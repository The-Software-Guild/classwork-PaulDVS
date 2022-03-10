package com.sg.compare;

import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		Set<CD> collection = new TreeSet<CD>(new SortBySinger());
		
		collection.add(new CD("CD D", "Artist A"));
		collection.add(new CD("CD E", "Artist D"));
		collection.add(new CD("CD A", "Artist B"));
		collection.add(new CD("CD D", "Artist E"));
		collection.add(new CD("CD B", "Artist C"));
		collection.add(new CD("CD A", "Artist A"));
		
		for(CD element:collection) {
			System.out.println(element);
		}
	}

}
