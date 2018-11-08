// program to demonstrate encapsulation

public class Encapsulate 
{
private String geekName;
private int geekAge;
private int geekRoll;

public String getName()
{
	return geekName;
}

public int getAge()
{
	return geekAge;
}

public int getRoll()
{
	return geekRoll;
}




public void setName(String name)
{
	geekName=name;
}
public void setAge(int age)
{
	geekAge=age;
}
public void setRoll(int roll)
{
	geekRoll=roll;
}





public static void main(String[] args) 
{
Encapsulate obj=new Encapsulate();

obj.setName("Harsh");
obj.setAge(19);
obj.setRoll(51);


System.out.println(" Geek's name is "+obj.getName());
System.out.println(" Geek's age is "+obj.getAge());
System.out.println(" Geek's roll no is "+obj.getRoll());
	
	
	
}


}
