/*
                           Second Method to implement MULTITHREADING using RUNNABLE INTERFACE
 */



class MyThread2 implements Runnable
{

	@Override
	public void run() 
	{
		System.out.println("running" + Thread.currentThread().getName());
		
	}
	
}


public class ThreadDemo2
{

	public static void main(String[] args) 
	{
		System.out.println(Thread.currentThread().getName());
		MyThread2 ob2=new MyThread2();
		Thread t2=new Thread(ob2);
		t2.start();
		
		Thread t3=new Thread(ob2," My Thread ");
		t3.start();
	}

}
