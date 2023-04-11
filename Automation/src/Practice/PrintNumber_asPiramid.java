package Practice;

public class PrintNumber_asPiramid {

	public static void main(String[] args)
	{
		int val = 1;
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.println(val + " ");
				val++;
			}
			System.out.println();
		}
		
	}
}
