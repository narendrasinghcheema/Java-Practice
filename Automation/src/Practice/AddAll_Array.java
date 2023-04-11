package Practice;

public class AddAll_Array {
public static void main(String[] args)
 {

	int a[] = {2,3,4,3,4,2};
	
	for(int i=0;i<a.length-1;i++)
	{
		a[i] += a[i+1];
		System.out.println(a[i]);
	}
 }
}
