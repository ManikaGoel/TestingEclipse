import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


class VNode{
	
	int value;
	boolean isLogin;
}


public class loginLogout {
public static void main(String[] args) {
		
	Scanner obj=new Scanner(System.in);
	
	VNode time[]=new VNode[10];
	int index=0;
	VNode node;
	
	for(int i=0; i<5; i++)
	{
		node=new VNode();
		node.value=obj.nextInt();
		node.isLogin=true;
	   
		time[index++]=node;
		
		node=new VNode();
		node.value=obj.nextInt();
		node.isLogin=false;
	   
		time[index++]=node;
	}
    
	Comparator<VNode> cmp=new Comparator<VNode>()
	{
		
		public int compare(VNode a, VNode b)
		{
			if(a.value< b.value)
				return -1;
			if(a.value==b.value)
				{
				if(!a.isLogin)
                                               Return -1;
                                             if(!b.isLogin)
 				Return 1;
				Else retun 0;
}
				
			
			return 1;
			
		}
	};

	
	//print the array
           
	Arrays.sort(time, cmp);
	
	//traverse the array
	int maxCon=0;
	int con=0;
	
	for(int i=0 ;i<time.length; i++)
	{
	  node=time[i];
		
	  System.out.println(node.value+"  "+node.isLogin);
	  
	  if(node.isLogin)
			con++;
		else con--;
		
		if(con>maxCon)
			maxCon=con;
	}
	
	
	System.out.println(maxCon);
}
}


