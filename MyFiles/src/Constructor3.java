/*          program to show that this() is used to call default constructor from inside parameterized constructor 
      
 */


class B
{
B()
{
	System.out.println("inside parent class constructor");
}
}
class Constructor3 extends B
{
	static int size;
Constructor3()
{
	// by default compiler will put super() here 
	
	System.out.println("inside default constructor");
	
}
Constructor3(int n)
{
	// we cannot put super() here as this() must be the first stmnt in constructor
	this();
	System.out.println("inside parameterized constructor");
	size=n;
}
	public static void main(String[] args) 
	{
	Constructor3 obj=new Constructor3();
	System.out.println("vale of size is "+size);
	}

}
