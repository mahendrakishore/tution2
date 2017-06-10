package com.june6;

import java.util.ArrayList;
import java.util.Iterator;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s1 = new Student(1,10,"aaa",78);
		Student s2 = new Student(2,20,"bbb",88);
		Student s3 = new Student(3,30,"ccc",67);
		Student s4 = new Student(4,40,"ddd",76);
		Student s5 = new Student(5,50,"eee",89);
		
		ArrayList<Student> al = new ArrayList<>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		al.add(s5);
		
		Iterator<Student> i = al.iterator();
		while(i.hasNext()){
			System.out.println(i.next());
		}
	}

}
