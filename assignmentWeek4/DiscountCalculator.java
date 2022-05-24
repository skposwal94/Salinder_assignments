package assignmentWeek4;

public class DiscountCalculator {

	public static void main(String[] args) {

		/*
		 * // Initialized a String variable for promo code that accepts the value for
		 * code. If valid promo code is identified than applicable discount is applied
		 * on top of flat 50% already existing or just 50% applied on all by default
		 */

		String promoCode = "null";
		double initialValue = 100; // assuming initial price to be 100$
		double initialdiscount = 50;
		System.out.println("We have an initial Price of: $" + initialValue);
		System.out.println("Initial discount: " + initialdiscount + "%\n");

		if (promoCode.equals("Promo5")) {

			System.out.println("You have selected Promo5");
			System.out.println("With an additional 5% discount total discount is 55% and  price is $"
					+ (initialValue - (initialValue * (50 + 5)) / 100));

		} else if (promoCode.equals("Promo10")) {

			System.out.println("You have selected Promo10");
			System.out.println("With an additional 10% discount total discount is 60% and  price is $"
					+ (initialValue - (initialValue * (50 + 10)) / 100));

		} else if (promoCode.equals("Promo20")) {

			System.out.println("You have selected Promo20");
			System.out.println("With an additional 20% discount total discount is 70% and  price is $"
					+ (initialValue - (initialValue * (50 + 20)) / 100));

		} else {

			System.out.println("You have not applied any valid promo code");
			System.out.println(
					"With flat 50% discount" + " your price is $" + (initialValue - (initialValue * (50)) / 100));
		}
	}

}
