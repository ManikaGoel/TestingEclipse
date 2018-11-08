import java.util.List;
import java.util.*;

public class ListDemo 
{
public static void main(String[] args) 
{
	List<Integer> list1=new ArrayList<>();
	list1.add(10);
	list1.add(10);
	System.out.println(list1);
	Set<Integer> set1=new LinkedHashSet<>();
	set1.add(30);
	set1.add(40);
	set1.add(30);
	System.out.println(set1);
	
	
}
}
