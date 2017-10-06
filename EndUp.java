import java.util.Scanner;

public class EndUp
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of string : ");
		String  a=s.nextLine();
		String b=endUp(a);
		System.out.println("The modified String is "+b);
	}
	public static String endUp(String str)
	{
		int c=str.length();
		if(c<=3)
			return str.toUpperCase();
		else
		{
		String s1=str.substring(c-3,c);
		return str.substring(0,c-3)+s1.toUpperCase();
		}
		//return str.length()>2?str.substring(0,str.length()-3)+str.substring(str.length()-3).toUpperCase():s
	}
}
		