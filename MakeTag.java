import java.util.Scanner;
public class MakeTag
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
      	System.out.println("enter the tag Name ;");
      	String s1=s.nextLine();	
      	System.out.println("enter the word Name ;");
      	String s2=s.nextLine();	
      	MakeTag m=new MakeTag();
      	String s3=m.makeTags(s1,s2);
      	System.out.println("The makeTags word is : "+s3);

	}
	public String makeTags(String tag, String word) 
	{
		return "<"+tag+">"+word+"</"+tag+">";
	}
}