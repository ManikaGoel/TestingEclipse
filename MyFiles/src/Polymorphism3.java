/*      program to demonstrate normal method overriding stating that
        
               compile time checks reference variable
               run time checks object
  
*/




class Parent
{
	void method1()
	{
		System.out.println("parents method1");
	}
	void method2()
	{
		System.out.println("parents method2");
	}
}

class Child extends Parent
{
	void method1()
	{
		System.out.println("childs method1");
	}
	void method3()
	{
		System.out.println("childs method3");
	}
}


public class Polymorphism3 
{

	public static void main(String[] args) 
	{
		Child obj1=new Child();
		Parent obj2=new Parent();
		Parent obj3=new Child();           // covariant
		
		obj1.method1();         //childs method1
		obj1.method2();         //parents method2
		obj1.method3();         //childs method3
		
		obj2.method1();         //parents method1
		obj2.method2();         //parents method2
		obj2.method3();                                                               // compile time error
		
		obj3.method1();        //childs method1
		obj3.method2();        //parents method2
		obj3.method3();	                                                              // compile time error
		
	}

}
