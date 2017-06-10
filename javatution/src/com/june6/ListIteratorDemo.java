package com.june6;


import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stubLinkedList<Integer> ll = new LinkedList<>();
		
		LinkedList<Integer> ll = new LinkedList<>();
		ListIterator<Integer> li = ll.listIterator();
		while(li.hasPrevious()){
			System.out.println(li.previous());
		}
	}

}
