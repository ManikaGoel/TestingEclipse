/*
             
 
 */



class Student8
{
	int id;
	String name;
	static String school;
	public Student8(int id, String name)
	{
		this.id=id;
		this.name=name;
		
	}
	
	
}



public class day5_8 
{
	public static void main(String[] args) 
	{
		Student8 s1=new Student8(1,"Ashish");
		System.out.println(s1);
		Student8 s3=(Student8) s1.clone();

	}

}
