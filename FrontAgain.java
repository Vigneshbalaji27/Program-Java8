import java.util.Scanner;
public class FrontAgain
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
      	System.out.println("enter the String Name : ");
      	String s1=s.nextLine();	
      	boolean b=frontAgain(s1);
      	System.out.println("The boolean value is "+b);
	}
	public static boolean frontAgain(String str)
	{
		/*if(str.length()==2)
			return true;
		else
		{
		String f=str.substring(0,2);
		String l=str.substring(str.length()-2,str.length());
		if(f.equals(l))
			return true;
		}
		return false;
		*/
		/*if(str.startsWith(str.substring(0,2))&&str.endsWith(str.substring(0,2)))
			return true;
			else
			return false;*/
		System.out.println(str.substring((str.length()-2)));
		return (str.substring(0,2)).equals(str.substring((str.length()-2)));
	}
}

