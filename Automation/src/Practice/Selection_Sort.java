package Practice;

public class Selection_Sort {

	public static void main(String[] args)
	{
		int a[] = {88,55,44,33,66,77,8,9};
	 
		int temp,min = 0;
		for(int i=0; i<a.length;i++)
		{
			min =i;
			for(int j=1+i;j<a.length;j++)
			{
				if(a[j]<a[min])
				{
					min = j;
				}
				temp = a[i];
				a[i] = a[min];
				a[min] = temp;
				
				
			}
			
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
	}
}
