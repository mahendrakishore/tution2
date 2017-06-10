package com.june6;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Vector<Integer> v = new Vector<>();
System.out.println(v.capacity());
v.addElement(10);
v.addElement(20);
System.out.println(v);
System.out.println(v.capacity());
for(int i= 10 ; i>0;i--){
	v.addElement(i);
}
System.out.println(v);
for( Integer j:v){
	System.out.println(j);
}
}
}