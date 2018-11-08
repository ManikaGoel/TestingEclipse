/*
             use of toString() method of object class: 
                    
    we cant create constructor of address class???? 
    becoz then in student5 class we have to declare many ref variables for adress class ????
             
 
 */

import java.util.*;

class Address
{
	String city;
	
	@Override
	public String toString()
	{
		
		return(" and city is: " + city); 
	}
	
}


class Student5
{
	int id;
	String name;
	static String school;
	Address addr;
	public Student5(int id, String name)
	{
		this.id=id;
		this.name=name;
		
	}

	@Override
	public String toString() 
	{
		
		return " id is: " + this.id + " name is: " + this.name + this.addr.toString();
		
	}
}



public class day5_4 
{
	public static void main(String[] args) 
	{
		
		Address addr=new Address();
		//this.addr.city="Lucknow";                     this gives error
		
		addr.city="lucknow";
		Student5 s1=new Student5(1,"Ashish");
		s1.addr=addr;                                //error comes if we don not write this stmnt
		System.out.println(s1);
		
		addr.city="Meerut";
		Student5 s2=new Student5(2,"Manika");
		s2.addr=addr;                                //error comes if we don not write this stmnt
		System.out.println(s2);
	}

}
