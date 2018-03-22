import java.util.Scanner;
public class AltPairs
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
      	System.out.println("enter the String : ");
      	String s1=s.nextLine();
      	//char c[]=s1.toCharArray();
      	/*System.out.println(c);*/
      	String b=altPairs(s1);
      	System.out.println("The value of b "+b);
	}
	public static String altPairs(String str)
	{
		/*String res="";
		int i=0;
		while(i<str.length())
		{
			res+=str.charAt(i);
			i++;
			System.out.println(res);
			if(i<str.length())
			{
				res+=str.charAt(i);
				System.out.println(res);
				i+=3;
			}
		}
		return res;*/
		String s="";
		for(int i=0;i<str.length();i+=4)
		{
		if(i==str.length()-1)
		s=s+str.charAt(i);
		else
		s=s+str.charAt(i)+str.charAt(i+1);
		}
		return s.trim();
		
	}
}
