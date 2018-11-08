
public class rajattest {
public static void main(String a[])
{
	String text="(000) 123-1234";
	System.out.println(text.matches("([1234567890]{3})\\s[1234567890]{3}-[1234567890]{3}"));	
}
}
