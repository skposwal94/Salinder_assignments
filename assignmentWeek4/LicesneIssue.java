package assignmentWeek4;

public class LicesneIssue {

	public static void main(String[] args) {

		int age = 17;
		String currentLevel = "G1"; // Initializing variables
		
		/*
		 * Logic used is if you are 18 or above you will get license of your current
		 * level if you are below 18 in that case you'r license will be reduced by 1
		 * level that means G to G2, G2 to G1 and if have G1 than no license
		 */
		 

		if (age >= 18 && currentLevel.equals("G")) {
			System.out.println("You have been issued an G License");

		} else if (age >= 18 && currentLevel.equals("G2")) {
			System.out.println("You have been issued an G2 License");

		} else if (age >= 18 && currentLevel.equals("G1")) {
			System.out.println("You have been issued an G1 License");

		} else if (age < 18 && currentLevel.equals("G")) {
			System.out.println("You have been issued an G2 License");
		}

		else if (age < 18 && currentLevel.equals("G2")) {
			System.out.println("You have been issued an G1 License");
		}

		else if (age < 18 && currentLevel.equals("G1")) {
			System.out.println("You can't be issued any License");
		}
	}

}
