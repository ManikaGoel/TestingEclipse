
public class TestLocalVariable 
{
	public void StudentAge() 
    {   //local variable age
        int age = 0;
        age = age + 5;
        //return age;
        System.out.println("Student age is : " + age); 
    }
 
    public static void main(String args[]) 
    {   
    	//using local variable age outside it's scope
    	TestLocalVariable t = new TestLocalVariable();
       // System.out.println(age);               // cannot access local variable in another func
       // t.age=10;                              // cannot access local variable even through object
      //  System.out.println(t.age);             //will not print since it cannot access local variable even through object
    	t.StudentAge();
    //	System.out.println(t.StudentAge()); // will give error if the func is of type void
    	                                    // will not give error if func returns anything eg if func is of type int and has return age stmnt 
        
    }
}
