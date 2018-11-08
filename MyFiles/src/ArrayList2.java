/*
 ArrayList mainly has 2methods:
 add()
 get() 
  
  
 
 */


import java.util.ArrayList;

public class ArrayList2 
{

	public static void main(String[] args)
	{
		ArrayList<Integer> obj=new ArrayList<Integer>();
		obj.add(1);
		obj.add(2);
		obj.add(3);
		obj.add(4);
		System.out.println(obj);
		System.out.println(obj.get(1));// getmathod takes teh index 1 as the parameter
		
		

	}

}
