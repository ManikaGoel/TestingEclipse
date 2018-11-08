/*      program to show that if we have defined parameterzied conmstructor in our class then we must define default 
        constructor as well because in this case compiler won't create it automatically for us.
        
        since we have not define default constructor so creating an object results in compile time error     */




public class Constructor1 
{
	static int a;
	Constructor1(int x)
	{
		a=x;
	}
	
	public static void main(String[] args) 
	{
		
Constructor1 obj=new Constructor1();
System.out.println("value of a is "+a);
	}

}
