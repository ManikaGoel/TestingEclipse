import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class IntersectionTwoArrays {
public static void main(String[] args) {
	
	Scanner obj=new Scanner(System.in);
	
	int arr1[], arr2[];
	
	int n1=obj.nextInt();
	arr1=new int[n1];
	
	for(int i=0; i<n1; i++)
		arr1[i]=obj.nextInt();
	
	int n2=obj.nextInt();
	
	arr2=new int[n2];
	
	for(int i=0 ; i<n2; i++)
		arr2[i]=obj.nextInt();
	
	//compare intersection arrays
	
	Arrays.sort(arr1);
	Arrays.sort(arr2);
	
	
	int index1=0, index2=0;
	ArrayList<Integer> list=new ArrayList<Integer>();
	
	while(index1<arr1.length && index2<arr2.length)
	{
		if(arr1[index1]<arr2[index2])
		{
			index1++;
		}
		else if(arr2[index2]<arr1[index1])
		{
			index2++;
		}
		else {
			//intersection found
			list.add(arr1[index1]);
			
			index1++;
			index2++;
		}
	
	}
	
	
	//print the list
	System.out.println(list.toString());
	
	
}
}
