package ArrayQuestions;

import java.awt.RenderingHints.Key;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Methodes_in_array {

	public static void main(String[] args)
	{
		String[] arr = {"Narendra", "Singh", "Cheema"};
		
		
		List<String> arrr = Arrays.asList(arr);
		Arrays.binarySearch(arrr, 2);
		
		arrr.add("loda");
		arrr.remove(2);
		System.out.println(arrr);
		
		
		
		
		
		
	}
}
