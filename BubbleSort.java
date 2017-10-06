import java.util.Scanner;
public class BubbleSort
{
	public static void main(String[] args) 
  	{
      Scanner s=new Scanner(System.in);
      System.out.println("enter the length of array = ");
      int k=s.nextInt();
      int[]  m=new int[k];
      for (int i=0;i<m.length;i++) 
      {
         System.out.println("Please Enter the number "+i +" = ");
         m[i]=s.nextInt();
      }
      System.out.println("The given array is ");
      System.out.print("[");
      for(int e:m)
      {
    	  System.out.print(e+",");
      }
      System.out.print("]");
      int[] b=bubbleSort(m);
      System.out.println("");
      System.out.println("");
      System.out.println("The modified array is ");
      System.out.print("[");
      for(int f:b)
      {
  		System.out.print(f+",");
      }
      System.out.print("]");
  	}
	public static int[] bubbleSort(int[] arr)
	{
		/*for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr;*/
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			if(arr[i]>arr[j])
			{
				arr[i]=arr[i]^arr[j];
				arr[j]=arr[i]^arr[j];
				arr[i]=arr[i]^arr[j];
			}
		}
		return arr;
	}

}
