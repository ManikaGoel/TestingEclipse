
public class Car1 
{
int no;
Car1(int no)
{
	this.no=no;
}
	static void swap(Car1 c1,Car1 c2)
	{
		int temp;
		temp=c1.no;
		c1.no=c2.no;
		c2.no=temp;
	}
	
	
	public static void main(String[] args) 
	{
	Car1 c1=new Car1(1);
	Car1 c2=new Car1(2);
	swap(c1,c2);
	System.out.println("car number for c1="+c1.no);
	System.out.println("car number for c2="+c2.no);
	
	}
	
	
}
