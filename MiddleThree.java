import java.util.Scanner;

public class MiddleThree {
		public static void main(String[] args) 
		{
			Scanner s=new Scanner(System.in);
	      	System.out.println("enter the String Name : ");
	      	String s1=s.nextLine();	
	      	String s2=middleThree(s1);
	      	System.out.println("The modified String is "+s2);
		}
		public static String middleThree(String str) 
		{
			int mid=str.length()/2;
			return str.substring(mid-1, mid+2);
		}
}