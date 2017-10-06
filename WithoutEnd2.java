import java.util.Scanner;

public class WithoutEnd2 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of string : ");
		String  a=s.nextLine();
		String b=withoutEnd2(a);
	    System.out.println("The final string is "+b);
	}
	public static String withoutEnd2(String str) 
	{
		  return str.substring(1,str.length()-1);
	}

	
}
