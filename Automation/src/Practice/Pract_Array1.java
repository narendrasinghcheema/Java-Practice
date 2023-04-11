package Practice;

public class Pract_Array1 {

	public static void main(String[] args)
	{
		Pract_Array[] a= new Pract_Array[5];
		
		a[0] = new  Pract_Array("Narendra", 1212);
		a[1] = new Pract_Array("Piyush", 1234);
		
		String b= a[0].getName();
		int c= a[1].getRollNumber();
		
		
		System.out.println("Name of student is = "+b+" and rollNumber is = "+c);
		
	}
}
