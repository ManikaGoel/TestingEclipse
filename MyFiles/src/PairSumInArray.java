import java.util.*;

public class PairSumInArray 
{
public static void main(String[] args)
{
	Scanner obj=new Scanner(System.in);
	int n=obj.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<n;i++)
	{
		arr[i]=obj.nextInt();
	}
	int count=0;
	int value=obj.nextInt();
	for(int i=0;i<n;i++)
	{
		for(int j=i+1;j<n;j++)
		{
			if(arr[i]+arr[j]==value)
			{
				count++;
			}
		}
	}
	
	System.out.println("no of pairs is"+count);	
}
		
}
