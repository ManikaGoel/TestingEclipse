import java.util.List;
import java.util.*;

public class ListDemo_2 
{
public static void main(String[] args) 
{
	List<Integer> list1=new ArrayList<>();
	list1.add(60);
	list1.add(70);
	list1.add(30);
	list1.add(20);
	list1.add(25);
	System.out.println(list1);
	Set<Integer> set1=new TreeSet<>();
	set1.add(60);
	set1.add(70);
	set1.add(30);
	set1.add(20);
	set1.add(25);
	set1.add(25);
	System.out.println(set1);
	
	
}
}
