import java.util.Scanner;

public class DelDel {
		public static void main(String[] args) 
		{
			Scanner s=new Scanner(System.in);
	      	System.out.println("enter the String Name : ");
	      	String s1=s.nextLine();	
	      	String s2=delDel(s1);
	      	System.out.println("The modified String is "+s2);
		}
		public static String delDel(String str) 
		{ 
			if(str.indexOf("del")==1)
				str=str.charAt(0)+str.substring(4,str.length());
			return str;
			/*if(str.indexOf("del")==1)
			{String[]d= str.split("del") ;
			return d[0]+d[1];}
			else
			return str;*/
			
		}

}
