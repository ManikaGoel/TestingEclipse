
public class ThreadDemo3 
{

	public static void main(String[] args)
	{
	Thread t1=new Thread(new Runnable()                    //imp step
	{
		public void run() 
		{
			System.out.println("running" + Thread.currentThread().getName());
			
		}
	});
	t1.start();
		
		
	
	Thread t2=new Thread(new Runnable()
	{
		public void run() 
		{
			System.out.println("running" + Thread.currentThread().getName());
			
		}
	});
	t2.start();
		
		
	}

}
