class MySingleton
{
	private static MySingleton ob=null;
	private MySingleton()
	{
		
	}
	public static MySingleton getInstance()
	{
		if(ob==null)
		{
			ob=new MySingleton();
		}
		
		return ob;
	}
}


public class Singleton1 
{
	public static void main(String[] args) 
	{
	MySingleton ob1=MySingleton.getInstance();
	System.out.println(ob1);
	MySingleton ob2=MySingleton.getInstance();
	System.out.println(ob2);
	}

}
