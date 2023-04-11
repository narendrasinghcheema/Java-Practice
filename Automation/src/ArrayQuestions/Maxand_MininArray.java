package ArrayQuestions;

public class Maxand_MininArray {

	public static void main(String[] args)
	{
		int a[] = {12,34,23,34,56,34,35,57,32,57};
		String c = "Shraddha Maneesh";
		String n = c.replaceAll("\\s+", "");
		char[] l = n.toCharArray();
		
		int larg_Value = a[0];
		int small_value = a[0];
		int j = 0;
		for (int i=1; i<a.length;i++)
		{
			if(a[i] > larg_Value)
			{
				larg_Value = a[i];
			}
			
			if(a[i]< small_value)
			{
				small_value = a[i];
			}
		}
		System.out.println("Large value = "+larg_Value);
		System.out.println("Small value = "+small_value);
		
		
		for(int i=0;i<=l.length;i++)
		{
			j = i+0;
			System.out.println(l.length);
		}
		System.out.println(j);
		
	}
}
