import java.util.Scanner;
public class MiddleTwo
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
      	System.out.println("enter the String Name : ");
      	String s1=s.nextLine();	
      	String s2=middleTwo(s1);
      	System.out.println("The modified String is "+s2);
	}
	public static String middleTwo(String str)
	{
		/*int l=str.length();
		String r="";
		r= str.substring((l/2-1),(l/2+1));
		return r;*/
		 return str.substring(str.length()/2-1,str.length()/2+1);
	}

}
