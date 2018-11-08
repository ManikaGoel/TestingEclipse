import java.util.Arrays;
import java.util.Scanner;

public class AnagramTest {
public static void main(String[] args) {
	
	Scanner obj=new Scanner(System.in);
	
	String input1=obj.next();
	String input2=obj.next();
	
	if(input1.length()!=input2.length())
	{
		System.out.println("No anagram");
	}
	
	else {
		
	char alph1[]=input1.toCharArray();
	char alph2[]=input2.toCharArray();
	
	
	//sorting 
	Arrays.sort(alph1);
	Arrays.sort(alph2);
	
	int index=0;
	boolean isAn=true;
	
	while(index<input1.length())
	{
		if(alph1[index]!=alph2[index])
		{
			isAn=false;
			break;
		}
		index++;
	}
	
	if(isAn)
		System.out.println("Anagram");
	
	else
		System.out.println("Not anagram");
	}
}
}
