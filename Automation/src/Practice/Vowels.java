package Practice;

import java.util.Scanner;

public class Vowels {

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("wright the name to check vowels");

		String input = s.nextLine();
		String a = input;
		
		if(a.matches(".*[aeiou].*"))
		{
			System.out.println("yes the given name contains vowels = "+a);
		}else
		{
			System.out.println("the given name is not match with vowels = "+a);
		}
	}
	
}
