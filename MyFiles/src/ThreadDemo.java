/*
                           First Method to implement MULTITHREADING using THREAD class
 */




class MyThread extends Thread
{
	public void run()
	{
		System.out.println("running" + Thread.currentThread().getName());
	}
}



public class ThreadDemo 
{

	public static void main(String[] args) 
	{
		System.out.println(Thread.currentThread().getName());
		MyThread ob=new MyThread();
		ob.start();
	}

}
