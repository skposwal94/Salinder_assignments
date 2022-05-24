package assignmentWeek4;

import java.util.Random;

public class CovidRestrictionApp2 {
	
public static void main(String[] args) {
		
		/*
		 * Included condition both people entering and leaving store.Used Random function for
		 * generating values of people entering and leaving loop runs till store at 50 persons
		 */

		Random random = new Random();

		int maxCapacity = 50; // maximum capacity fixed at 50
		int numberOfPeopleEntering = 0; // Number of new people about to enter store (assuming sensory input)
		int numberOfPeopleLeaving = 0;
		int peopleInStore = 30; // Initial no. of people in store can be changed
		System.out.println("Currrent store count is at: " + peopleInStore); // displaying initial count

		while (peopleInStore <= maxCapacity) {

			numberOfPeopleEntering = random.nextInt(15);  // used random function for no. of people entering 

			if (numberOfPeopleEntering == 0) {
				System.out.println("No new people entering store"); 
				break;
			}

			peopleInStore += numberOfPeopleEntering - numberOfPeopleLeaving;
			// to enter
			System.out.println(numberOfPeopleEntering + " more persons about to enter store"); 

			if (peopleInStore >= 50) { 

				if (peopleInStore > 50) {
					System.out.println("\nSorry " + (peopleInStore - 50) + " persons will have to wait");
				} 
				peopleInStore = 50; 
				System.out.println("Maximum Capacity reached");
				System.out.println("Store is at its limit at " + peopleInStore);
				break;

			}

			System.out.println("No. of people in store currently: " + peopleInStore + "\n");

			numberOfPeopleLeaving = random.nextInt(5); // used random function for no. of people leaving 
			System.out.println("No. of people leaving " + numberOfPeopleLeaving);
			System.out.println("No. of people in store now at: " + (peopleInStore - numberOfPeopleLeaving));

		}

	}

}
