class StudentInfo
{
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudentInfo other = (StudentInfo) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	int id;
	String name;
	static String school_name;
	StudentInfo(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
}


public class Student 
{
public static void main(String[] args) 
{
	StudentInfo s1=new StudentInfo(1,"mani");
	StudentInfo s2=new StudentInfo(2,"rajat");
	StudentInfo.school_name="DPS";
	System.out.println("initially");
	System.out.println(s1.school_name);
	System.out.println(s2.school_name);
	System.out.println(StudentInfo.school_name);
	
	
	s1.school_name="Sophia";       // or s2.school_name="Sophia"; or StudentInfo.school_name="Sophia"; 
	System.out.println("after reinitialization");
	System.out.println(s1.school_name);
	System.out.println(s2.school_name);
	System.out.println(StudentInfo.school_name);
	
}
}
