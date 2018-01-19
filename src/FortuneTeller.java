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
		String fortune1 = "";
		if (age % 2 == 0) {
			//Age is even
			if (age < 35) {
				if (age == 34) {
					fortune1 = "you will be balding within the next year!";
				} else {
					fortune1 = "you will be balding within " + (35 - age) + " years!";
				}
				
			} else {
				fortune1 = "you will lose an eye in a fight with a great swan!";
			}
		} else //Age is odd
		{
			fortune1 = "you will find gold in the basement of your first bought house!";
		}
		
		//Siblings fortune
		String fortune2 = "";
		if (siblings == 0) {
			fortune2 = "You will find a long lost identical twin on a company paid holiday in the Seychelles.";
		} else if (siblings == 1) {
			fortune2 = "You will be elector mayor of a small farm town where their cash crop is seaweed.";
		} else if (siblings == 2) {
			fortune2 = "You will be the sole reason Iowa breaks into two states.";
		} else if (siblings == 3) {
			fortune2 = "Your life story will be made into a movie starring James Franco and Ellen Page. \nIt flops at the box office but becomes a cult classic in Bahrain.";
		} else if (siblings > 3) {
			fortune2 = "You will wake up one day and realise that you're " + (age/2) + " years old and that half of your life was just a dream.";
		} else if (siblings < 0) {
			fortune2 = "Bruh, you LITERALLY cannot have less than 0 siblings. That's just not a thing at all.";
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
		String fortune3 = "";
		if (children == 0) {
			fortune3 = "You will have no children.";
		} else if (children == 1) {
			fortune3 = "You will have one child. That's enough, right?";
		} else if (children == 2) {
			fortune3 = "You will have twins!";
		} else if (children > 2 && children < 9) {
			fortune3 = "You will have " + children + " children.";
		} else if (children == 9) {
			fortune3 = "You will have " + children + "children. Damn, dude.";
		}
		
		//Dogs
		String fortune4 = "";
		if (dogs == 1) {
			fortune4 = "You will also have a dog.";
		} else if (dogs > 1) {
			fortune4 = "You also will have " + dogs + " dogs.";
		}
		
		//Cats
		String fortune5 = "";
		if (cats == 1) {
			fortune5 = "You will also have a cat.";
		} else if (cats > 1 && cats < 15) {
			fortune5 = "You will also have " + cats + " cats";
		} else if (cats == 15) {
			fortune5 = "You will be, as the kids call it, a crazy cat lady. Fifteen cats, at least.";
		}
		
		//Birth month
		String dreamJob = "";
		if (birthMonth >= 1 && birthMonth <= 3) {
			dreamJob = "a wristband model.";
		} else if (birthMonth >= 4 && birthMonth <= 6) {
			dreamJob = "the CEO of a false eyelash company.";
		} else if (birthMonth <= 7 && birthMonth <= 9) {
			dreamJob = "an olympic basket weaver.";
		} else if (birthMonth >= 10 && birthMonth <= 12) {
			dreamJob = "one of those people who spins the signs outside of car dealerships, but you make a lot of money from it.";
		} else {
			dreamJob = "zoo animal clean-up, because you didn't follow directions.";
		}
		
		System.out.println(firstName + " " + lastName + ", " + fortune1 + "\n" + fortune2 + "\n" + fortune3 + " " + fortune4 + " " + fortune5 + "\nYou will also get your dream job, which is " + dreamJob);
		
		input.close();
	}
}
