/*
             use of toString() method of object class: 1)Normally
                                                       2)Using LIST OF INTEGERS 
                                                       3)USING INTEGER ARRAY
                                                       4)Using LIST OF STUDENTS
             
             here List class as well as Integer class have already overriden their toString() method
             therefore the toString() of both the classes List and Integer gets executed
             
             also in our class Student4 since we have not overriden the method
             therefore the toString() of List and STUDENT class gets executed only for list and not for student
             
 
 */

import java.util.*;

class Student4
{
	int id;
	String name;
	static String school;
	public Student4(int id, String name)
	{
		this.id=id;
		this.name=name;
		
	}

	                  // we have not overriden the toString() method in our Student4 class
}



public class day5_3 
{
	public static void main(String[] args) 
	{
		Student4 s1=new Student4(1,"Ashish");
		System.out.println(s1);                      //executes toString() of Object class
		
		List<Integer> list=new ArrayList<>();
		list.add(10);
		list.add(20);
		System.out.println(list);     //executes toString() of LIST class and INTEGER class combined
		
		int arr[]=new int[2];
		arr[0]=1;
		arr[1]=2;
		System.out.println(arr);          //executes toString() of INTEGER class
		
		List<Student4> list1=new ArrayList<>();
		list1.add(s1);
		System.out.println(list1);      //executes tostring() of LIST class only as STUDENT4 class has not 
										//overriden toString()
	}

}
