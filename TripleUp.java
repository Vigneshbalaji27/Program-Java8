import java.util.Scanner;
public class TripleUp
{

   private static Scanner s;

public static void main(String[] args) 
   {
      s = new Scanner(System.in);
      System.out.println("enter the value of k = ");
      int k=s.nextInt();
      int[]  nums=new int[k];
      for (int i=0;i<nums.length;i++) 
      {
         System.out.println("Please Enter the number "+i +" = ");
         nums[i]=s.nextInt();
      }
      boolean isTripleUp=false;
      /*for(int i=0;i<nums.length-2;i++)
      {
         if(nums[i]+1==nums[i+1]&&nums[i]+2==nums[i+2])
         {
         isTripleUp=true;
         }
      }
      System.out.println("isTripleUp = "+isTripleUp);*/
      for(int i=0;i<nums.length-2;i++)
      {
         int temp=nums[i];
         if((nums[i+1]==(temp+1))&&(nums[i+2]==(temp+2)))   
         {
            isTripleUp= true;
         }
      }
            System.out.println("isTripleUp = "+isTripleUp);
   }
}

