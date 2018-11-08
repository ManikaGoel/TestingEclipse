import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

class Node{
	
	int rating;
	int count;
	
	Node(int r, int c)
	{
		rating=r;
		count=c;
	}
}


public class HotelRating {
public static void main(String[] args) {

	HashMap<Integer, Node> hotel=new HashMap<Integer, Node>();
	
	
	Scanner obj=new Scanner(System.in);
	
	int cp=0;
	while(cp<6)
	{
		int htl=obj.nextInt();
		int user=obj.nextInt();
		int rat=obj.nextInt();
		
		if(!hotel.containsKey(htl))
			hotel.put(htl, new Node(rat, 1));
		
		else {
			
			Node node=hotel.get(htl);
			node.rating+=rat;
			node.count++;
			
		}
		
		cp++;
		
	}
	
	//traverse the hotel map
	Set<Integer> set=hotel.keySet();
	Object hotlNum[]=set.toArray();
	System.out.println(getHotelList(hotlNum, hotel, 7));
}

public static String getHotelList(Object hotel[], HashMap<Integer, Node> map, int avg)
{
	String res="";
	
	for(Object inte:hotel)
	{
		Node node=map.get((Integer)inte);
		int av=(node.rating/node.count);
		
		if(av>=avg)
			res+=inte+" ";
	}
	return res;
}

}
