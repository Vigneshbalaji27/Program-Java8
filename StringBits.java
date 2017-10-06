import java.util.Scanner;
public class StringBits
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
      	System.out.println("enter the String Name : ");
      	String s1=s.nextLine();	
      	String s2=stringBits(s1);
      	System.out.println("The modified String is "+s2);
	}
	public static String stringBits(String str) 
	{ 
		StringBuffer sb=new StringBuffer();
		//System.out.println(sb);
		for(int i=0;i<str.length();i+=2)
		{
			sb.append(str.charAt(i));
		}
		return sb.toString();
		/*String s4="";
		for(int i=0;i<str.length();i+=2)
		{
		  s4=s4+str.charAt(i);
		}
		return s4;*/
	}
}

