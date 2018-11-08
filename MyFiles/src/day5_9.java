class Student6
{
	int id;
	String name;
	static String school;
	Address addr;
	public Student6(int id, String name)
	{
		this.id=id;
		this.name=name;
		
	}
}



public class day5_9 
{

	public static void main(String[] args) 
	{
		Student6 s1=new Student6(10,"mani");
		Student6 s2=new Student6(20,"rajat");                  
		System.out.println(s1.equals(s2));      //returns false as s1 and s2 are two differnt objects
		
		Student6 s3=s1; 
		System.out.println(s1.equals(s3));      //returns true as s2 ponits to same object to which s1 points
		
		
	}

}
