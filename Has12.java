import java.util.Scanner;

public class Has12 {
	public static void main(String[] args) 
  	{
      Scanner s=new Scanner(System.in);
      System.out.println("enter the value of k = ");
      int k=s.nextInt();
      int[]  m=new int[k];
      for (int i=0;i<m.length;i++) 
      {
         System.out.println("Please Enter the number "+i +" = ");
         m[i]=s.nextInt();
      }
      boolean a=has12(m);
      System.out.println("The boolean value is "+a);
  	}
      
      /*public static boolean has12(int[] nums) 
      {
    	  boolean hasOne=false;
    	  boolean hasTwo=false;
    	  int start=0;
    	  for(int i=0;i<nums.length;i++)
    	  {
    		  if(nums[i]==1)
    		  {
    			hasOne=true;
    			start=i;
    			break;
    		  }
    	  }
    	  for(int i=start;i<nums.length;i++)
    	  {
    		  if(nums[i]==2)
    		  {
    			hasTwo=true;
    			break;
    		  }
    	  }
    	  return (hasOne==true && hasTwo==true);
      }*/
	public static boolean has12(int[] nums) {
		boolean flag=false;
		for(int i=0;i<=nums.length-1;i++){
		int a=nums[i];
		if(a==1 && !flag)
		flag=true;
		if(flag && a==2)
		return flag;
		if(flag && i==(nums.length-1)) 
		flag=false;
		}
		return flag;
		}
	/*public static boolean has12(int[] nums){
	int c1=0,c2=0;
	for(int x:nums)
	{if(x==1)
	c1++;
	if(x==2)
	c2++;}
	if(c1>0&&c2>0)
	return true;
	else return false;
	}*/
}
