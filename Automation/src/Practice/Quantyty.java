package Practice;

import org.apache.poi.ss.formula.atp.Switch;

public class Quantyty {

	public static void main(String[] args)
	{
		String a[] = {"Samsung", "Nokia", "Motorola", "Google Pixel"};
		
		int prices[] = {20000, 15000, 40000, 50000};
		
		String index_Value = "Samsung";
		int Item_Price = 0;
		
		int count = 4;
		int index = -1;
		
		for(int i=0; i<=a.length; i++)
		{
			if(index_Value.equals(a[i]))
			{
				index = i;
				break;
			}
		}
		
		if(index != 0)
		{
			Item_Price = prices[index];
		}else
		{
			System.out.println("No items present");
		}
		
		int total = count * Item_Price;
		
		System.out.println("total price for product = "+index_Value+" is = "+total);
	}
}
