 class Glass
{
	 int prop1=1;
	int prop2=2;
}
 class Jug extends Glass
{
	int prop3=3;
	int prop4=4;
}



public class Polymorphism1 
{
	public static void main(String[] args) 
	{
	Glass g=new Jug();
	
	g.prop1;
	g.prop2;
	g.prop3;
	g.prop4;
	
	
	}

}
