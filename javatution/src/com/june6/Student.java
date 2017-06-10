package com.june6;

public class Student {

int id , age ;String name ; float  per; 
	
	Student(int id , int age ,String name ,float  per ){
		this.id = id;
		this.age = age;
		this.name = name;
		this.per = per;
	}
	public String toString(){
		return ("int id ,"+id+" int age ;"+age+"String name ;"+name+"float  per;"+per);
		
	}
}
