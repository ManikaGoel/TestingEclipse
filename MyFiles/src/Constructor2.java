/*                 program to show that super() keyword cannot be the second stmnt in the constructor
                   super() if declared must always be the first statemnent inside the constructor     */



class A
{
A()
{
	System.out.println("inside parent class construcor");
	super();
}
}



class Constructor2 extends A 
{
	static int a;
	Constructor2(int x)
	{
		
		System.out.println("inside child class constructor");
		a=x;
	}
	
	public static void main(String[] args) 
	{
		
//Constructor2 obj=new Constructor2();
Constructor2 obj=new Constructor2(5);
System.out.println("value of a is "+a);
	}

}
