package com.sg.compare;

import java.util.Comparator;

public class SortBySinger implements Comparator<CD> {

	@Override
	public int compare(CD o1, CD o2) {
		if(o1.getSinger().compareTo(o2.getSinger()) > 0) {
			return 1;
		}
		return -1;
		
		
		
	}

}
