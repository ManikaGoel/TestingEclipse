/*      program to demonstrate METHOD HIDING stating that
        
               compile time checks reference variable type
               run time checks reference variable type
  
*/



class Parent4
{
	static void method1()
	{
		System.out.println("parents method1");
	}
	static void method2()
	{
		System.out.println("parents method2");
	}
}

class Child4 extends Parent4
{
	static void method1()
	{
		System.out.println("childs method1");
	}
	static void method3()
	{
		System.out.println("childs method3");
	}
}



public class Polymorphism4 
{
	public static void main(String[] args) 
	{
		//Child4 obj1=new Child4();
		//Parent4 obj2=new Parent4();
		Parent4 obj3=new Child4();           // covariant
		
		//obj1.method1();         //childs method1
		//obj1.method2();         //parents method2
		//obj1.method3();         //childs method3
		
		//obj2.method1();         //parents method1
		//obj2.method2();         //parents method2
		//obj2.method3();         // compile time error
		
		obj3.method1();        //parents method1
		obj3.method2();        //parents method2
		obj3.method3();	       //compile time error 

	}

}
