/*
             use of toString() method of object class:
             
             System.out.println(s1); is equivalent to
             System.out.println(s1.toString());
             
             since we have not overriden toString() in our own class, therefore toString() 
             method of object class is called by default
             which prints:
             classname@hashcode
 
 */




public class day5_1 {

	public static void main(String[] args) 
	{
		day5_1 obj=new day5_1();
		System.out.println(obj);
		System.out.println(obj.toString());
	}

}
