import java.util.Scanner;

public class CountConsonents 
{
	public static void main(String[] args) 
	{

		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of string : ");
		String  a=s.nextLine();
		int c=countConsonents(a);
		System.out.println("The count is "+c);
	}
	public static int countConsonents(String s)
	{
		int count=0;
		String s2=s.toLowerCase();
		for(int i=0;i<s2.length();i++)
		{

			char c=s2.charAt(i);
			if((int)c >=97 && (int)c<=122)
			{
			  if(c!='a' && c!='e'&& c!='i'&& c!='o'&& c!='u')
			  {
			  	System.out.println("The consonants = "+c);
			  	count++;
			  }
				
			}

		}

		System.out.println("The value of count = "+count);
		return count;
	}
}
