package com.june6;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> al1 = new ArrayList<>();
		al1.add("");
		al1.add("");
		al1.add("");
		al1.add("");
		al1.add("");
		ArrayList<Integer> al2 = new ArrayList<>();
		for(int  i= 30 ; i>0 ;i--){
			al2.add(i);
		}
		System.out.println(al2);
		
		Iterator<Integer> i = al2.iterator();
		while(i.hasNext()){
			Integer temp = i.next();
			if(temp>15){
				i.remove();
			}
			else{
				System.out.println(temp);
			}
		}
	}

}
