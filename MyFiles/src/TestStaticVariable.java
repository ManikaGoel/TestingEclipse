/*
 
Static Variables: Static variables are also known as Class variables.
These variables are declared similarly as instance variables, the difference is that static variables are declared using the static keyword within a class outside any method constructor or block.
Unlike instance variables, we can only have one copy of a static variable per class irrespective of how many objects we create.
Static variables are created at start of program execution and destroyed automatically when execution ends.
To access static variables, we need not to create any object of that class, we can simply access the variable as:

class_name.variable_name;


*/

public class TestStaticVariable
{
	public static int engMarks=1;
    

    public static void main(String args[])
    {   
    	
    	System.out.println(engMarks);
    	TestStaticVariable.engMarks;   //it is able to access but has nothing to print or initialize, therefore giving error
    	TestStaticVariable.engMarks=2;                                         
        System.out.println(TestStaticVariable.engMarks);                     
      
    	
    }
}
