package com.june6;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> hs = new HashSet<>();
		hs.add("red");
		hs.add(null);
		hs.add("blue");
		hs.add(null);
		hs.add("red");
		hs.add(null);
		hs.add("blue");
		hs.add(null);
		System.out.println(hs);
		
		LinkedHashSet<String> lhs = new LinkedHashSet<>();
		lhs.add("red");
		lhs.add(null);
		lhs.add("blue");
		lhs.add(null);
		lhs.add("red");
		lhs.add(null);
		lhs.add("blue");
		lhs.add(null);
		System.out.println(lhs);
		
	 TreeSet<String> ts = new TreeSet<>();
	    ts.add("red");
		//ts.add(null);
		ts.add("blue");
		//ts.add(null);
		 ts.add("red");
			//ts.add(null);
			ts.add("blue");
			//ts.add(null);
		System.out.println(ts);
		
	}

}
