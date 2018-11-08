class MySingleton1
{
	private static MySingleton1 ob=null;
	private MySingleton1()
	{
		
	}
	public static MySingleton1 getInstance()
	{
		if(ob==null)
		{
			ob=new MySingleton1();
		}
		
		return ob;
	}
}


public class Poly 
{
	public static void main(String[] args) 
	{
		/*
	MySingleton1 obj1=MySingleton1.getInstance();
	System.out.println(obj1);
	MySingleton1 obj2=MySingleton1.getInstance();
	System.out.println(obj2);
	*/
	
		MySingleton1 ms=new MySingleton1();
	}

}
