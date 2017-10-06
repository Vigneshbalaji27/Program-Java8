import java.util.Scanner;
public class EndsLy
{

   public static void main(String[] args) 
   {
      Scanner s=new Scanner(System.in);
      System.out.println("enter the String Name ;");
      String s1=s.nextLine();
      boolean b=endsLy(s1);
      System.out.println("The boolean value : "+b);
   }
   public static boolean endsLy(String str) 
   {
	   /*String s2=str.toLowerCase();
	   if(s2.endsWith("ly"))
		   return true;
	   else
		   return false;*/
	   /*int len=str.length();
	   if((str.charAt(len-1)=='y') && (str.charAt(len-2)=='l'))
	    return true;
	   	return false;*/
	   //return str.substring((str.length()-2)).equals("ly"); 
	   //return str.endsWith("ly");
	   int i=str.indexOf("ly",str.length()-2);
	   System.out.println(i);
	   if(!(i==-1))
	   return true;
	   else return false;
   }

}