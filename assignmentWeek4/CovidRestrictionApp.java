package assignmentWeek4;

public class CovidRestrictionApp {

	public static void main(String[] args) {
		
		/*
		 * Initialized three variables maximum capacity fixed at 50 in this case and
		 * no. of people in store at start, number of people entering the store (can
		 * be even above 50) Than based on provided values while loop will run and stop when
		 * count reached 50 added an extra line to display number of people that might need to
		 * wait from last increment
		 */

		int maxCapacity = 50;              // maximum capacity fixed at 50
		int numberOfPeopleEntering = 0;    // Number of new people about to enter store can be changed
		int peopleInStore = 0;             // Initial no. of people in store can be changed
		System.out.println("Currrent store count is at: "+ peopleInStore);  // displaying initial count

		while (peopleInStore <= maxCapacity) {
			
			if(numberOfPeopleEntering == 0) {
				System.out.println("No new people entering store");    // To prevent infinite while loop if no more people entering
				break;
			}

			peopleInStore += numberOfPeopleEntering;  // Calculating no. of people will be in store if all people allowed to enter
			System.out.println(numberOfPeopleEntering +" more persons about to enter store");  // printing how many people about to enter store

			if (peopleInStore >= 50) {                 // to break if value in line 20 exceeds/equals 50

				if(peopleInStore>50) {System.out.println("\nSorry "+ (peopleInStore - 50)+ " persons will have to wait");} // extra statement to inform how many people waiting 
				peopleInStore = 50;															// reset value back to 50
				System.out.println("Maximum Capacity reached");
				System.out.println("Store is at its limit at "+ peopleInStore);
				break;

			}
			
			System.out.println("No. of people in store currently: " + peopleInStore + "\n"); // executed only if count below 50/block code from line 30 skipped

		}

	}

}
