

class Person{
	
	private String firstName;
	private String lastName;
	private String middleName;
	
	public void setFirstName(String fname)
	{
		firstName=fname;
	}
	
	public void setLastName(String lname)
	{
		lastName=lname;
	}
	
	public void setMiddleName(String mname)
	{
		middleName=mname;
	}
	
	public String fullName()
	{
		return firstName+" "+middleName+" "+lastName;
	}
}

public class FullNameTest {
public static void main(String[] args) {
	
	Person person=new Person();
	person.setFirstName("rajat");
	person.setLastName("goel");
	person.setMiddleName("Kumar");
	System.out.println(person.fullName());
	
}
}
