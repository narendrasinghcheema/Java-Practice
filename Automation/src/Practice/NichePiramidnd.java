package Practice;

public class NichePiramidnd {

	public static void main(String[] args)
	{
		int i,j;
		
		for(i=1; i<=4; i++)
		{
			for(j=4; j>=i; j--)
			{
				System.out.println("* ");
			}
			System.out.println();
		}
	}
}
