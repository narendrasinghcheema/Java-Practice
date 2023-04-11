package ArrayQuestions;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Find_a_peak_elementwhichisnotsmallerthan_its_neighbours {

	public static void main(String[] args)
	{
		
		int a[] = {10,22,12,33,44};
		int largest = a[0];
		
		for(int i=1; i<a.length; i++)
		{
			if(a[i] > largest)
			{
				largest = a[i];
			}
		}
		System.out.println("The largest value in the array is: " + largest);
	}
}