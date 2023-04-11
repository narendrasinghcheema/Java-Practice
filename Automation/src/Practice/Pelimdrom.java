package Practice;

import org.apache.poi.ss.formula.functions.Replace;

public class Pelimdrom {

	public static void main(String[] args)
	{
		int n = 1231;
		String number = Integer.toString(n);
		String reverse = new StringBuilder(number).reverse().toString();
		int a = Integer.parseInt(reverse);
		System.out.println(Integer.parseInt(reverse));
		
		
		if(n == a)
		{
           System.out.println("number is pelidrom");
		}else
		{
			System.out.println("number is not pelidrom");
		}
	}
}
