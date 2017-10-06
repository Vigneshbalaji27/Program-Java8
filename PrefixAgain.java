import java.util.Scanner;

public class PrefixAgain 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String ");
		String s1=s.nextLine();
		System.out.println("Enter the number ");
		int a=s.nextInt();
		boolean b=prefixAgain(s1,a);
		System.out.println("The boolean value is "+b);
	}
	public static boolean prefixAgain(String s1,int a)
	{
		String e1=s1.substring(0,a);
		String e2=s1.substring(a,s1.length());
		return e2.contains(e1);
		/*char[] c=s1.toCharArray();
		for(char c1:c)
		System.out.println("c1= "+c1);*/
		
	}
}
