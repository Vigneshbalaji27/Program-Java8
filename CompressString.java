import java.util.Scanner;

public class CompressString 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the String");
	    String s1=sc.nextLine();
	    String k=compressString(s1);
	    System.out.println("The compressed String is "+k);
	}
	/*public static String compressString(String s)
	{
		int len=s.length();
		int count=1;
		String str="";
		for(int i=0;i<s.length();i++)
		{
			if(i!=(len-1) && s.charAt(i)==s.charAt(i+1))
			{
				count++;
			}
		}
		str=str+s.charAt(i)+count;
		if(str.length()>s.length())
			return s;
		else
			return str;
	}*/
	public static String compressString(String s)
	{
		/*int c=1;String str="";
		for(int i=0;i<s.length()-1;i++)
		{
			if(s.charAt(i)==s.charAt(i+1))
				c++;
			else
			{
				str=str+s.charAt(i)+""+c;
				c=1;
			}
		if(i+1==s.length()-1)
		str=str+s.charAt(i+1)+""+c;
		}
		if(s.length()>str.length())
			return str;
		else
			return s;
		}*/
		int count=1;String str="";
		for(int i=0;i<s.length();i++)
		{
			if (i!=s.length()-1 && s.charAt(i)==s.charAt(i+1))
			{	
				count++;
			} 
			else
			{
				str=str+s.charAt(i)+count;
				count=1;
			}
		}
		return s.length()>=str.length()?str:s;
	}
}
