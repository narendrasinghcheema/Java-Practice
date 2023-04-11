package Practice;

public class PrimeNumber {

	public static void main(String[] args)
	{
		
		
		for(int j=1;j<=100;j++)
		{
			int temp = 0;
			
			for(int i=2;i<=j-1;i++)
			{
				if(j%i==0)
				{
					temp = temp+1;
				}
			}
			if(temp==0)
			{
				System.out.println(j);
			}
		}
		
		
		
	}
	
}
