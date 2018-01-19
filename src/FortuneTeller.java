import java.util.Scanner;

public class FortuneTeller {
	public static void main(String[] args) {
		//Initialise the Scanner
		Scanner input = new Scanner(System.in);
		
		//Collect user input
		System.out.println("Hello. Welcome to Micheal's fortune teller!");
		System.out.println("Enter your first name.");
		String firstName = input.nextLine();
		firstName = firstName.toLowerCase();
		System.out.println("Enter your last name.");
		String lastName = input.nextLine();
		lastName = lastName.toLowerCase();
		System.out.println("Enter your age.");
		int age = input.nextInt();
		input.nextLine();
		System.out.println("Please enter your birth month as a number.");
		int birthMonth = input.nextInt();
		input.nextLine();
		System.out.println("What is your favourite ROYGBIV colour? \nType 'help' if you need a list of colours.");
		String colour = input.nextLine();
		colour = colour.toLowerCase();
		if (colour.equalsIgnoreCase("help")) {
			System.out.println("Red\nOrange\nYellow\nGreen\nBlue\nIndigo\nViolet");
			System.out.println("What is your favourite ROYGBIV colour?");
			colour = input.nextLine();
		}	
		System.out.println("How many siblings do you have?");
		int siblings = input.nextInt();
		
		///DETERMINE FORTUNE///
		
		//Age fortune
		if (age % 2 == 0) {
			//Age is even
			if (age < 35) {
				if (age == 34) {
					System.out.println("You will be balding within the next year!");
				} else {
					System.out.println("You will be balding within " + (35 - age) + " years!");
				}
				
			} else {
				System.out.println("You will lose an eye in a fight with a great swan.");
			}
		} else //Age is odd
		{
			System.out.println("You will find gold in the basement of your first bought house.");
		}
		
		//Siblings fortune
		if (siblings == 0) {
			System.out.println("You will find a long lost identical twin on a company paid holiday in the Seychelles.");
		} else if (siblings == 1) {
			System.out.println("You will be elector mayor of a small farm town where their cash crop is seaweed.");
		} else if (siblings == 2) {
			System.out.println("You will be the sole reason Iowa breaks into two states.");
		} else if (siblings == 3) {
			System.out.println("Your life story will be made into a movie starring James Franco and Ellen Page. \nIt flops at the box office but becomes a cult classic in Bahrain.");
		} else if (siblings > 3) {
			System.out.println("You will wake up one day and realise that you're " + (age/2) + " years old and that half of your life was just a dream.");
		} else if (siblings < 0) {
			System.out.println("Bruh, you LITERALLY cannot have less than 0 siblings. That's just not a thing at all.");
		}
		
		//Colour fortune
		int children = 0;
		int dogs = 0;
		int cats = 0;
		
		if (colour.equals("red")) {
			children = 0;
			dogs = 2;
			cats = 0;
		} else if (colour.equals("orange")) {
			children = 1;
			dogs = 0;
			cats = 0;
		} else if (colour.equals("yellow")) {
			children = 0;
			dogs = 3;
			cats = 2;
		} else if (colour.equals("green")) {
			children = 5;
			dogs = 1;
			cats = 0;
		} else if (colour.equals("blue")) {
			children = 9;
			dogs = 0;
			cats = 0;
		} else if (colour.equals("indigo")) {
			children = 0;
			dogs = 0;
			cats = 0;
		} else if (colour.equals("violet")) {
			children = 0;
			dogs = 0;
			cats = 15;
		}
		
		//Children
		if (children == 0) {
			System.out.println("You will have no children.");
		} else if (children == 1) {
			System.out.println("You will have one child. That's enough, right?");
		} else if (children == 2) {
			System.out.println("You will have twins!");
		} else if (children > 2 && children < 9) {
			System.out.println("You will have " + children + " children.");
		} else if (children == 9) {
			System.out.println("You will have " + children + "children. Damn, dude.");
		}
		
		//Dogs
		if (dogs == 1) {
			System.out.println("You will also have a dog.");
		} else if (dogs > 1) {
			System.out.println("You also will have " + dogs + " dogs.");
		}
		
		//Cats
		if (cats == 1) {
			System.out.println("You will also have a cat.");
		} else if (cats > 1 && cats < 15) {
			System.out.println("You will also have " + cats + " cats");
		} else if (cats == 15) {
			System.out.println("You will be, as the kids call it, a crazy cat lady. Fifteen cats, at least.");
		}
		
		//Birth month
		String dreamJob = "";
		if (birthMonth >= 1 && birthMonth <= 3) {
			dreamJob = " wristband model";
		} else if (birthMonth >= 4 && birthMonth <= 6) {
			dreamJob = " CEO of a false eyelash company";
		} else if (birthMonth <= 7 && birthMonth <= 9) {
			dreamJob = "n olympic basket weaver";
		} else if (birthMonth >= 10 && birthMonth <= 12) {
			dreamJob = " one of those people who spins the signs outside of car dealerships, but you make a lot of money from it";
		} else {
			dreamJob = " zoo animal clean-up, because you didn't follow directions";
		}
		
		
		
		
		input.close();
	}
}
