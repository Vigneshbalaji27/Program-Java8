import java.util.Scanner;

public class StartWord 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of string str : ");
		String  a=s.nextLine();
		System.out.println("Enter the value of string word : ");
		String  b=s.nextLine();
		String  c=startWord(a,b);
		System.out.println("The modified string is "+c);
		
	}
	public static String startWord(String str, String word) 
	{
		//if(str.substring(1).startsWith(word.substring(1)))
			/*String g=word.substring((1),1);
			System.out.println("g = "+g);*/
		System.out.println(str.indexOf(word.substring(1),1));
			if(str.indexOf(word.substring(1),1)==1)
			return str.substring(0,word.length());
			else
			return str;
	}
}
