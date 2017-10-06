import java.util.Scanner;
public class NonStart
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
      	System.out.println("enter the String a : ");
      	String s1=s.nextLine();
      	System.out.println("enter the String b : ");
      	String s2=s.nextLine();
      	String h=nonStart(s1,s2);
      	System.out.println("The value of combined string is "+h);
	}
	public static String nonStart(String a, String b)
	{
		  return a.substring(1,a.length())+b.substring(1,b.length());
	}
}
	