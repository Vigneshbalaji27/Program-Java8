import java.util.Scanner;
public class MakeOutWord
{
	public static void main(String[] args) 
	{
		/*Scanner s=new Scanner(System.in);
      	System.out.println("enter the out Name ;");
      	String s1=s.nextLine();	
      	System.out.println("enter the word Name ;");
      	String s2=s.nextLine();	
      	MakeOutWord m=new MakeOutWord();
      	String s3=m.makeOutWord(s1,s2);
      	System.out.println("The make out word is : "+s3);
      	System.out.println("\"hello\"");*/
      	char c='\ubeef';
      	System.out.println(c);
           	
      	

	}
	public String makeOutWord(String out,String word)
	{
		return out.substring(0,2)+word+out.substring(2,4);
	}
}