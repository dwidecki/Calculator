import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the Calculator App!");
		System.out.println("What type of numbers are you trying to calculate?");
		System.out.println("Press 1 for integer, Press 2 for double, Press 3 for float");
		int numberType = sc.nextInt();
		if(numberType == 1) {
			System.out.println("Enter in an integer");
			int operand1 = sc.nextInt();
			System.out.println("Enter in an integer");
			int operand2 = sc.nextInt();
			System.out.println("Press 1 to add, Press 2 to subtract, Press 3 to multiply, Press 4 to divide");
			int answer = sc.nextInt();
			if(answer == 1) {
				System.out.println((operand1 + operand2));
			}
			else if(answer == 2) {
				System.out.println((operand1 - operand2));	
			}
			else if(answer == 3) {
				System.out.println((operand1 * operand2));
			}
			else if(answer == 4){
				if(operand2 == 0) {
					System.out.println("Error: Divide by Zero");
				}
				else {
					System.out.println((operand1 / operand2));
				}
			}
			}
		else if(numberType == 2) {
			System.out.println("Enter in a double");
			double operand1 = sc.nextDouble();
			System.out.println("Enter in a double");
			double operand2 = sc.nextDouble();
			System.out.println("Press 1 to add, Press 2 to subtract, Press 3 to multiply, Press 4 to divide");
			int answer = sc.nextInt();
			if(answer == 1) {
				System.out.println((operand1 + operand2));
			}
			else if(answer == 2) {
				System.out.println((operand1 - operand2));	
			}
			else if(answer == 3) {
				System.out.println((operand1 * operand2));
			}
			else if(answer == 4){
				if(operand2 == 0.0) {
					System.out.println("Error: Divide by Zero");
				}
				else {
					System.out.println((operand1 / operand2));
				}
			}
		}
		else {
			System.out.println("Enter in a float");
			float operand1 = sc.nextFloat();
			System.out.println("Enter in a double");
			float operand2 = sc.nextFloat();
			System.out.println("Press 1 to add, Press 2 to subtract, Press 3 to multiply, Press 4 to divide");
			int answer = sc.nextInt();
			if(answer == 1) {
				System.out.println((operand1 + operand2));
			}
			else if(answer == 2) {
				System.out.println((operand1 - operand2));	
			}
			else if(answer == 3) {
				System.out.println((operand1 * operand2));
			}
			else if(answer == 4){
				if(operand2 == 0) {
					System.out.println("Error: Divide by Zero");
				}
				else {
					System.out.println((operand1 / operand2));
				}
				
			}
		}
	}

}
