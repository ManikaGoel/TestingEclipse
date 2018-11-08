
public class Test_ReInitializeVariable 
{
	public static void main(String args[])
    {
        for (int x = 0; x < 4; x++)
        {
            System.out.println(x);
        }
 
        // Will produce error
        System.out.println(x);
    }
}


//Correct Way to do this is : 
	
	public class Test_ReInitializeVariable 
	{
		public static void main(String args[])
	    {
			int x;
	        for (x = 0; x < 4; x++)
	        {
	            System.out.println(x);
	        }
	 
	        
	        System.out.println(x);
	    }
	}
	
	
	
--------------------------------------------------------------------------------------------------------------------------------------------
public class Test_ReInitializeVariable 
{
	public static void main(String args[])
    {
        int a = 5;
        for (int a = 0; a < 5; a++)
        {
            System.out.println(a);
        }
    }
}	
	
	//Correct way to do this is :
	
public class Test_ReInitializeVariable
{
	public static void main(String args[])
    {
        int a = 5;  or int a;
        for (a = 0; a < 5; a++)
        {
            System.out.println(a);
        }
    }
}

--------------------------------------------------------------------------------------------------------------------------------------------

public class Test_ReInitializeVariab
{
    public static void main(String args[])
    {
        {
            int x = 5;
            {
                int x = 10;
                System.out.println(x);
            }
        }
    }
}

//Correct way to do this is:

public class Test_ReInitializeVariab
{
    public static void main(String args[])
    {
        {
            int x = 5; or int x;
            {
                x = 10;
                System.out.println(x);
            }
        }
    }
}

