// program for call by reference


public class Rectangle1 
{
int length;
Rectangle1(int l)
{
	length=l;
}
static void modify(Rectangle1 r2)
{
	r2.length=20;
	System.out.println("length of r2 is"+r2.length);
}
	
	
	public static void main(String[] args)
	{
		Rectangle1 r1=new Rectangle1(10);
		modify(r1);
		System.out.println("length of r1 is"+r1.length);
		
	}
	
}
