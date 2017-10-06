public class TestThread
{
	public static void main(String[] args) 
	{
		BingoThread t1=new BingoThread();
		t1.start();
		for(int i=0;i<50;i++)
		{
			System.out.println("Bongo "+i);
		}
	}
}

class BingoThread extends Thread
{
	public void run()
	{
		for(int i=0;i<50;i++)
		{
			System.out.println("Bingo "+i);
		}
	}
}
