import java.util.Scanner;
public class CountXX
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
      	System.out.println("enter the String : ");
      	String s1=s.nextLine();
      	//char c[]=s1.toCharArray();
      	//System.out.println(c);
      	int b=countXX(s1);
      	System.out.println("The value of b "+b);
      	System.out.println(s1.indexOf('x'));
	}
	public static int countXX(String str)
	{
		/*int count=0;
		char[] c=str.toCharArray();
		for(int i=0;i<c.length-1;i++)
		{
			if(c[i]=='x' && c[i+1]=='x')
			{
				count++;
			}
		}
		return count;*/
		 int l=0,i=-1;
			i=str.indexOf("xx",i+1);

			while(i!=-1)
			{i=str.indexOf("xx",i+1);
			l++;} 
			return l;
			/*str=str.toLowerCase();
			int count=0;
			if(str.contains("x"))
			{
			int c=str.indexOf('x');
			for(int i=c;i<(str.length()-1);i++) {
			if(str.charAt(c)==(str.charAt(++c)))
			count=count+1;
			}
			return count;
			}
			return count;*/
			/*int c=0;
			for(int i=0;i<str.length()-1;i++)
			{
			if(str.charAt(i)=='x'&&str.charAt(i+1)=='x')
			c++;
			}
			return c;*/
			
	
	}
}