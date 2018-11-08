/*
                          Use of hashCode() method of object class: 
                          
                          Overriding hashCode() method in our class
  
  
 */



public class day5_6 
{
	static int last_roll = 100; 
    int roll_no;
 
    // Constructor
    day5_6()
    {
        roll_no = last_roll;   //100
        last_roll++; //101
    }
 
    // Overriding hashCode()
    @Override
    public int hashCode()
    {
        return roll_no;      //100
    }
	public static void main(String[] args) 
	{
		day5_6 obj1=new day5_6();
		System.out.println(obj1.hashCode());
		
		day5_6 obj2=new day5_6();
		System.out.println(obj2.hashCode());

	}

}
