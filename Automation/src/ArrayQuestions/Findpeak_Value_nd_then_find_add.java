package ArrayQuestions;

public class Findpeak_Value_nd_then_find_add {

	public static void main(String[] args)
	{
		int a[] = {12,24,12,45,90,45,33,44};
		
		int temp = 0;
		
		for(int i=1;i<a.length-1;i++)
		{
			temp = a[i-1] + a[i+1];
			if(a[i] == 	temp )
			{
				System.out.println("pick number is after addition both nightbhood = "+temp);
			}
		}
	}
}
