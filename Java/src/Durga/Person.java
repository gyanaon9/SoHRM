package Durga;

public class Person {
	
	String name;
	int rollno;
	Person(String name,int rollno)
	{
		this.name=name;
		this.rollno=rollno;
		System.out.println(name+"  "+rollno);
	}
}
class Student extends Person{
	int age;
	int marks;
	Student(String name,int age,int rollno,int marks )
	{
	super(name,rollno);
	this.age=age;
	this.marks=marks;
	
	System.out.println(name+"  "+age+"__"+rollno+"-----"+marks);
	}
}

