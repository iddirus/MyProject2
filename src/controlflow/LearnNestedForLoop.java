package controlflow;

import java.util.Scanner;

public class LearnNestedForLoop {
	
	
	public static void main(String[] args) {
		
		LearnNestedForLoop.nestedForLoop();
		LearnNestedForLoop.useScannerForLoop();
		
	}
	
	public static void nestedForLoop() {
		
		for(int c=3;c<9;c++) { // Parent loop
			System.out.println("this is parent loop ");
			for(int d=5;d<=7;d++) { // Nested or child loop 
				System.out.println("this is nested loop "+d);
			}
		}
		
		
	}
	
	public static void useScannerForLoop() {
		
		Scanner input= new Scanner(System.in);
        System.out.println("Enter your Number");
        int rowNumber= input.nextInt();

        for (int i= 1; i<= rowNumber; i++){
            for (int j =1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
		
	}

}
