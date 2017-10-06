import java.util.HashSet;
import java.util.Scanner;
public class IsStringUnique
{

   public static void main(String[] args) 
   {
      Scanner s=new Scanner(System.in);
      System.out.println("Enter the String Name ;");
      String s1=s.nextLine();
      boolean b=isStringUnique(s1);
      System.out.println("The value of b = "+b);
   }
   public static boolean isStringUnique(String s)
   {
	   /*for(int i=0;i<s.length();i++)
	   {
		   String str=""+s.charAt(i);
		   if(s.indexOf(str,i+1)>=0)
			   return false;
	   }
	   return true;*/
	   /*boolean b=true;
	   for(int i=0;i<s.length()-1;i++)
	   {
		   if (s.substring(i+1).contains(s.charAt(i)+""))
			   return b=false;
	   }
	   return b;*/
	   /*HashSet<Character> hs=new HashSet<Character>();
	   int len=s.length();
	   for(int i=0;i<s.length();i++)
	   {
	   char ch=s.charAt(i);
	   hs.add(ch);
	   }
	   if(len==hs.size())
	   return true;
	   else
	   return false;*/
	   
	   for(int i=0;i<s.length();i++)
	   {
		   String str=""+s.charAt(i);
		   if(s.indexOf(str,i+1)>0)
			   return false;
	   }
	   return true;
	   
   }
}