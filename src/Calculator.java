import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter in a number");
		int operand1 = sc.nextInt();
		System.out.println("Enter in a number");
		int operand2 = sc.nextInt();
		System.out.println("Press 1 to add, Press 2 to subtract");
		int answer = sc.nextInt();
		if(answer == 1) {
			System.out.println((operand1 + operand2));
		}
		else {
			System.out.println((operand1 - operand2));	
		}
		
	}

}
