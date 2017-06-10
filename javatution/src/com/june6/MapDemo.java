package com.june6;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
HashMap<Integer,String> hm = new HashMap<>();
hm.put(1, "aaa");
hm.put(null, "aaa");
hm.put(2, null);
hm.put(null, null);
hm.put(1, "aaa");
hm.put(3, "aaa");
System.out.println(hm);

TreeMap<Integer,String> tm = new TreeMap<>();
tm.put(1, "aaa");
//tm.put(4, "aaa");
tm.put(2, null);
tm.put(5, null);
//tm.put(null, null);
tm.put(1, "aaa");
tm.put(3, "aaa");
System.out.println(tm);

LinkedHashMap<Integer,String> lhm = new LinkedHashMap<>();
lhm.put(1, "aaa");
lhm.put(null, "aaa");
lhm.put(2, null);
lhm.put(null, null);
lhm.put(1, "aaa");
lhm.put(3, "aaa");
System.out.println(lhm);

	}

}
