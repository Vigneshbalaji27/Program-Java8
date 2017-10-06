import java.util.Scanner;
public class IsStringRotated
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the String S1");
	    String s1=sc.nextLine();
	    System.out.println("Enter the String S2");
	    String s2=sc.nextLine();
	    boolean k=isStringRotated(s1,s2);
	    System.out.println("is the String rotated,the value is "+k);	
	}
	public static boolean isStringRotated(String s1,String s2)
	{
		//return ((s1+s1).contains(s2));
		
		String str= s2.substring(s2.length()-2);
		if(s1.indexOf(s2.substring(s2.length()-2))>0&&s1.length()==s2.length())
		return true;
		else
		return false;
	}
}
