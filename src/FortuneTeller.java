import java.util.Scanner;

public class FortuneTeller {
	public static void main(String[] args) {
		//Initialise the Scanner
		Scanner input = new Scanner(System.in);
		
		//Collect user input
		System.out.println("Hello. Welcome to Micheal's fortune teller!");
		System.out.println("Enter your first name.");
		String firstName = input.nextLine();
		System.out.println("Enter your last name.");
		String lastName = input.nextLine();
		System.out.println("Enter your age.");
		int age = input.nextInt();
		System.out.println("Please enter your birth month as a number. (mm format)");
		int birthMonth = input.nextInt();
		System.out.println("What is your favourite ROYGBIV colour? \nType 'help' if you need a list of colours.");
		String colour = input.nextLine();
		System.out.println("How many siblings do you have?");
		int siblings = input.nextInt();
		
		
		
		input.close();
	}
}
