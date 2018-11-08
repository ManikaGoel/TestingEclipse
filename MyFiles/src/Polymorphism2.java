/*          Access modifier for an overriding method can only be same or more but not less
            than that of overriden method
            
 */




class Animal1
{
	public void method1()
	{
		System.out.println("inside animal class");
	}
}

class Dog1 extends Animal1
{
	protected void method1()
	{
		System.out.println("inside dog class");
	}
}



public class Polymorphism2 
{
	public static void main(String[] args) 
	{
		Animal1 obj=new Dog1();
		obj.method1();
		

	}

}
