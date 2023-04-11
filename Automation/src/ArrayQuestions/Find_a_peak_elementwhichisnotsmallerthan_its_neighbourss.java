package ArrayQuestions;

public class Find_a_peak_elementwhichisnotsmallerthan_its_neighbourss {

	public static void main(String[] args)
	{
		int a[] = {23,24,22,23,42,34};
		
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>=a[i-1] && a[i]>=a[i-1])
			{
				System.out.println("Pead number is = "+a[i]);
			}
		}
	}

}
