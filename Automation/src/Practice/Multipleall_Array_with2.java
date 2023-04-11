package Practice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Multipleall_Array_with2 {

	public static void main(String[] args)
	{
		
		int a[] = {2,3,4,5,6,7,8};
		
		for (int i=0;i<a.length;i++)
		{
			a[i] = a[i] * 2;
			
		}
		System.out.println(Arrays.toString(a));
	}
	
}
