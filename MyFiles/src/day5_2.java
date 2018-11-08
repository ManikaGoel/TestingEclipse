/*
             use of toString() method of object class:
             
             System.out.println(s1); is equivalent to
             System.out.println(s1.toString());
             internally sop(s1) calls toString() method of object class, but if you have overriden that 
             method in your class
             then the overriden method of our class gets executed
 
 */



class Student3
{
	int id;
	String name;
	static String school;
	public Student3(int id, String name)
	{
		this.id=id;
		this.name=name;
		
	}
	
	@Override
	public String toString() 
	{
		
		return " id is: " + this.id + " name is: " + this.name;
		//return (" id is: " + this.id + " name is: " + this.name);   equivalent to above statement
	}
	
}



public class day5_2 
{
	public static void main(String[] args) 
	{
		Student3 s1=new Student3(1,"Ashish");
		System.out.println(s1);

	}

}
