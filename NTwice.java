import java.util.Scanner;
public class NTwice
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
      	System.out.println("enter the String Name ;");
      	String s1=s.nextLine();	
      	System.out.println("enter the int value ;");
      	int s2=s.nextInt();	
      	NTwice n=new NTwice();
      	String s3=n.nTwice(s1,s2);
      	System.out.println("The output value is : "+s3);
	}
	public String nTwice(String str, int n) 
	{
  		return str.substring(0, n)+str.substring((str.length()-n),(str.length()));
	}

}