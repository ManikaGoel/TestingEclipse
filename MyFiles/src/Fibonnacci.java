import java.util.Scanner;

public class Fibonnacci {
public static void main(String[] args) {
	
	Scanner obj=new Scanner(System.in);
	
	int n=obj.nextInt();
	
	//int fib=fib(n);
	fibIterative(n);
	//System.out.println(fibIterative(n));
}

public static void fibIterative(int n)
{
	if(n<=0)
	{
		System.out.println("Invalid value.");
		return;
	}
	
	int a=0;
	int b=1;
	int c=a+b;
	
	if(n==1)
		System.out.println(0);
	
	else if(n==2)
		System.out.println(1);
	else {
	int count=3;
	
	while(count<n)
	{
		a=b;
		b=c;
		c=a+b;
		count++;
	}
	
System.out.println(c);
	}
}

public static int fib(int n)
{
	if(n==1)
		return 0;
	if(n==2)
		return 1;
	
	return fib(n-1)+fib(n-2);
}
}
