package com.june6;

import java.util.LinkedList;

public class LinkedListDemo {
	
	public static void main(String[] args) {
		LinkedList<Integer> ll = new LinkedList<>();
		ll.add(10);
	
				for(int i = 9;i>=0;i--){
			ll.add(i);
			//System.out.println(ll);
		}
				System.out.println(ll);
				ll.addFirst(11);
				ll.addLast(12);
				System.out.println(ll);
				ll.removeLast();
				ll.removeFirst();
				System.out.println(ll.getFirst());
				System.out.println(ll.getLast());
				
	}
	}
