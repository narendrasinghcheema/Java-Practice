package Practice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Sorting_array {

	public static void main(String[] args)
	{
		int a[] = {3,2,4,7,6,1,5,8,10,9};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length-1;j++)
			{
				if(a[j] > a[j+1])
				{
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println("now 1 = "+a[i]);
		}
	
//===========================another way=====================================
		
		Arrays.sort(a);
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Now 2 = "+a[i]);
		}
	}
}
