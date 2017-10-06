import java.util.Scanner;

public class EveryNth {
	
	public static void main(String[] args) 
	   {
	      Scanner s=new Scanner(System.in);
	      System.out.println("Enter the String Name :");
	      String s1=s.nextLine();
	      System.out.println("Enter the int value :");
	      int s2=s.nextInt();
	      String b=everyNth(s1,s2);
	      System.out.println("The modified String is = "+b);
	   }
	public static String everyNth(String str, int n) 
	{
		/*String res="";
		for(int i=0;i<str.length();i+=n)
		{
			res=res+str.charAt(i);
		}
		return res;*/
		String s="";
		char [] c=new char[str.length()];
		for(int i=0;i<c.length;i+=n)
		{ 
			s+=str.charAt(i);
		}
		return s.replace(" ","");

	}


}
