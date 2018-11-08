// program for call by value



public class Rectangle 
{
int length;
static void modify(int r2)
{
	r2=20;
	System.out.println("value of r2 is"+r2);
}
public static void main(String[] args) 
{
	int r1=10;
	modify(r1);
	System.out.println("value of r1 is"+r1);
	
	
}
	
	
}
