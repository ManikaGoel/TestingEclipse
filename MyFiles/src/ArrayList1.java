/*
 Internal implementation of ArrayList 
  
 
 */



import java.util.*;

class MyArrayList<T>
{
	int count;
	int size;
	Object arr[];
	public MyArrayList() 
	{
		count=0;
		size=10;
		arr=new Object[size];
	}
	
	T get(int i)
	{
		return (T) arr[i];
	}
	
	void add(T t)
	{
		if(count>=size)
		{
			Object arr1[]=new Object[2*size];
			Arrays.copyOf(arr,2*size);
			arr1=arr;  //check whether it shud be this or arr=arr1;
		}
		arr[++count]=t;
	}
}




public class ArrayList1 
{
	public static void main(String[] args) 
	{
		List<Integer> ar=new ArrayList<>();
		ar.add(10);
		ar.add(20);
		ar.add(30);
		System.out.println(ar);
	}

}
