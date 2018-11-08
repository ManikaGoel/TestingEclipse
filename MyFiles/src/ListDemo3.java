/*
 *            implementation of comparable interface
 * 
 * 
 */




import java.util.List;
import java.util.*;

class Student9 implements Comparable<Student9>
{
	int id;
	String name;
	static String school;
	Address addr;
	public Student9(int id, String name)
	{
		this.id=id;
		this.name=name;
		
	}
	
	@Override
	public int compareTo(Student9 ob)
	{
		return ob.id-this.id;
	}
}



public class ListDemo3 
{
public static void main(String[] args) 
{
	List<Integer> list1=new ArrayList<>();
	list1.add(60);
	list1.add(70);
	list1.add(30);
	list1.add(20);
	list1.add(25);
	System.out.println(list1);
	Collections.sort(list1);
	System.out.println(list1);
	
	
	
	Student9 s1=new Student9(1,"Ashish1");
	Student9 s2=new Student9(2,"Ashish2");
	Student9 s3=new Student9(3,"Ashish3");
	Student9 s4=new Student9(4,"Ashish4");
	
	
	List<Student9> list2=new ArrayList<>();
	list2.add(s2);
	list2.add(s3);
	list2.add(s1);
	list2.add(s4);
	
	System.out.println(list2);
	Collections.sort(list2);
	System.out.println(list2);
	
	
	
	
	
}
}
