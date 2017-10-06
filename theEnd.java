import java.util.Scanner;

public class theEnd {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
      	System.out.println("enter the String Name : ");
      	String s1=s.nextLine();
      	System.out.println("Enter the boolean front ");
      	boolean b=s.nextBoolean();
      	String s2=theEnd(s1,b);
      	System.out.println("The modified String is "+s2);
	}
	public static String theEnd(String str,boolean front) 
	{ 
		String s="";
		if(front==true)
		s=s+str.charAt(0);
		else
		s=s+str.charAt(str.length()-1);
		return s;
	}

}
