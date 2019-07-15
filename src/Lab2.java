import java.util.Scanner;

public class Lab2 {

	public static void main(String[] args){
		boolean keepGoing = true;
		while (keepGoing == true) {
		System.out.println("Please enter value of length of classroom");
		Scanner scan = new Scanner(System.in); 
		double length = scan.nextDouble();
		
		System.out.println("Please enter value of width of classroom");
		double width = scan.nextDouble();
		
		System.out.println("Area ="+  length*width);
		System.out.println("Perimeter =" + (length*2 + width*2));
		
		System.out.println("Would you like to continue?");
		scan.nextLine();
		
		String dataselection = scan.nextLine ();
		keepGoing = false;
		if (dataselection.equals("yes"))
		{keepGoing = true;}
		
		System.out.println("Thanks for playing");
		} 
	}
	
}
