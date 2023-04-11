package Grouos;

import org.testng.annotations.Test;

public class Grouping {

	@Test(groups = "Smoke")
	public void Test1()
	{
		System.out.println("at test1 ");
	}
	
	@Test(groups = "Smoke")
	public void Test2()
	{
		System.out.println("at test2 ");
	}
	
	@Test(groups = "Regression")
	public void Test3()
	{
		System.out.println("at test3 ");
	}
	
	@Test(groups = "Regression")
	public void Test4()
	{
		System.out.println("at test4 ");
	}
	
	@Test(groups = "Weekly_Build")
	public void Test5()
	{
		System.out.println("at test5 ");
	}
}
