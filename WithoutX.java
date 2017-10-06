import java.util.Scanner;
public class WithoutX
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
      	System.out.println("enter the String : ");
      	String s1=s.nextLine();
      	String b=withoutX(s1);
      	System.out.println("The value of b "+b);
	}

	public static String withoutX(String str) 
	{
		if(str.charAt(0)=='x'&&str.charAt(str.length()-1)=='x')
			return str.substring(1,str.length()-1);
			else if(str.charAt(0)=='x')
			return str.substring(1,str.length());
			else if(str.charAt(str.length()-1)=='x')
			return str.substring(0,str.length()-1);
			else return str;
	}
}
