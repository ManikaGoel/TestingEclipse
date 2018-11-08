class Animal
{
	static void method1()
	{
	System.out.println("method1 of animal");	
	}
}

class Dog extends Animal
{
	
}


public class Static_Method_Not_Overriden
{

	public static void main(String[] args)
	{
		//Animal obj1=new Animal();
		Dog obj2=new Dog();
		//Animal obj3=new Dog();
		
		//obj1.method1();
		obj2.method1();
	    //obj3.method1();
	}

}
