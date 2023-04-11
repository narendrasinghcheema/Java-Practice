package Practice;

import java.util.Scanner;

public class TakeInputfromuserandsprt_thearray {

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		
        System.out.print("Enter the size of the array: ");

		int[] a = new int [size];
		
		for(int i=0;i<=size;i++)
		{
			a[i] = s.nextInt();
		}
		
	}
}
