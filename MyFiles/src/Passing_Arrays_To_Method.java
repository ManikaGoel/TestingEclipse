// Java program to demonstrate passing of array to method


public class Passing_Arrays_To_Method 
{
	
	public static void addition(int arr[])
	{
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println("sum of array values is "+sum);
	}
	
	
	public static void main (String[] args)
    {
		int arr[]= {1,2,3,4,5};
        Passing_Arrays_To_Method obj=new Passing_Arrays_To_Method();
        obj.addition(arr);
    }
}
