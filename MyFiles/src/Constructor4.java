/*     program to show that this() is used to call parameterized constructor from inside default constructor
   
 */




class C
{
C()
{
	System.out.println("inside parent class constructor");
}
}
class Constructor4 extends C
{
	static int size;
Constructor4()
{
	// we cannot put super() here as this() must be the first stmnt in the constructor
	this(5);
	System.out.println("inside default constructor");
	
}
Constructor4(int n)
{
	// by default compiler will put super() stmnt here
	System.out.println("inside parameterized constructor");
	size=n;
}
	public static void main(String[] args) 
	{
	Constructor4 obj=new Constructor4();
	System.out.println("vale of size is "+size);
	}

}