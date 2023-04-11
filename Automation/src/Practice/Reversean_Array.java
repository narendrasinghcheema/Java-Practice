package Practice;

public class Reversean_Array {

	public static void main(String[] args)
	{
		String a = "Narendra";
		
		String nrr = "";
		for(int i=a.length()-1;i>=0;i--)
		{
			nrr =  nrr + a.charAt(i);
		}
		System.out.println("a = "+nrr);
	}
	
	{
		String a = "Narendra";
		StringBuilder reversethestring = new StringBuilder(a).reverse();
		System.out.println("b = "+reversethestring);
	}
}
