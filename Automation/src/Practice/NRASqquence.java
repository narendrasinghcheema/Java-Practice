package Practice;
import java.util.Scanner;

	public class NRASqquence {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter an NRA sequence: ");
	        String nra = scanner.nextLine();

	        if (nra.matches("[NRA]+")) {
	            System.out.println("The input is an NRA sequence.");
	            System.out.print("Enter another value for ? = ");
	            String another = scanner.nextLine();

	            if (another.equals("N")) {
	                System.out.println("The input value is correct.");
	            } else if (another.equals("A") || another.equals("R")) {
	                System.out.println("Warning: the input value is not correct.");
	            } else {
	                System.out.println("Invalid input value.");
	            }
	        } else {
	            System.out.println("The input is not an NRA sequence.");
	        }

	        scanner.close();
	    }
	}


