import java.util.Scanner;
public class LastTwo
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
      	System.out.println("enter the String : ");
      	String s1=s.nextLine();
      	String b=lastTwo(s1);
      	System.out.println("The value of b "+b);
	}
	public static String lastTwo(String str) 
	{
		return (str.substring(0, str.length()-2)+str.charAt(str.length()-1)+str.charAt(str.length()-2));
	}
}
