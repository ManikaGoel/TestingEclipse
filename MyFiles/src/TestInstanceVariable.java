/* 
 
Instance Variables: Instance variables are non-static variables and are declared in a class outside any method, constructor or block.
As instance variables are declared in a class, these variables are created when an object of the class is created and destroyed when the object is destroyed.
Unlike local variables, we may use access specifiers for instance variables. 
If we do not specify any access specifier then the default access specifier will be used.
Each object of the class will have its own copy of instance variable.


*/

public class TestInstanceVariable
{
	int engMarks=1;
    

    public static void main(String args[])
    {   
    	TestInstanceVariable t=new TestInstanceVariable();
    	//System.out.println(engMarks); // static func cannot access non-static variable
    	//t.engMarks;                   // it is able to access but has nothing to print or initialize, therefore giving error
    	t.engMarks=2;                                                           
        System.out.println(t.engMarks);                                       
     
    	
    }
}
