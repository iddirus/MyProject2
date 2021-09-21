package problemsolving;

import java.util.Scanner;

public class YearlySalary {
	
	// we have to use scanner 
	
	
	public static void main(String[] args) {
		
		
		// create object of scanner
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your first name");
		
		String firstName = input.nextLine();
		
		
		System.out.println("First Name : "+firstName);
		
		System.out.println("Enter your last name");
		
		String lastName = input.nextLine();
		
		System.out.println("Last Name : "+lastName);
		
		

		System.out.println("Enter monthly salary");
		int monthlySalary=input.nextInt();
		System.out.println("monthly salary "+monthlySalary);
		int yearlySalary=monthlySalary*12;
		System.out.println("yearly salary "+yearlySalary);
		
		
		input.close();
		
		
		
	}

	
		
	}


