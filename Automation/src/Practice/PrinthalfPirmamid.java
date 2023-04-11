package Practice;

public class PrinthalfPirmamid {
	public static void main(String[] args)
	{
		int i,j;
		
		
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.println("*");
			}
			System.out.println("\n");
		}
		for(int k=1;k<=4;k++)
		{
			for(int S=4;S>=k; S--)
			{
				System.out.println("*");
			}
			System.out.println("\n");
		}
	}
}
