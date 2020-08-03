package assignmentonproject2;

import java.util.Scanner;

public class AdhikariTakeOutProjects {

	final static double tipRate = 0.15;
	final static double taxRate = 0.07;

	public static void displayMainMenu() {
		System.out.println("What Type of Food would you like to order");
		System.out.println("1. Italian\n\n2. Chinese\n\n3. American");
		System.out.println("==========================================");
		System.out.println("Enter your Choice");
	}

	public static void displayItalianFoodMenu() {
		System.out.println("Here are  your choices");
		System.out.println(
				"1. Lasagna Tray-Feeds 5-$17.99\n2. Pizza Pack-Feeds 7-$15.99\n3. Gazpacho Soup, Salad and bread sticks pack-Feeds 4-$12.99");
		System.out.println("============================================");
	}

	public static void displayChineseFoodMenu() {
		System.out.println("Here are  your choices");
		System.out.println("1. Chicken and Broccoli " + "Tray(includes 7 wonton soups, 7 egg rolls)-"
				+ "feeds 7 - $18.99\n2. Sweet and Sour Pork Tray(includes 7 hot and sour soups, 7 egg rolls)-feeds 7- $18.99\n3. Shrimp Fried Rice Tray(includes 10 egg rolls)-Feeds 5-$10.9 ");

	}

	public static void displayAmericanFoodMenu() {
		System.out.println("Here are  your choices");
		System.out.println("1. Hamburger and Hot Dog Tray- includes bun and condiments-feeds 8- $21.99\n"
				+ "2. Grilled Chicken Sandwich and Mozzarella Sticks Tray- includes dipping sauces- Feeds 5 - $22.99\n3. Barbeque Tray- includes buns and peach cobbler- Feeds 10- $26.99");

	}

	public static int determineTrays(int people, int feeds) {
		double trays = 0.00;
		if (people % feeds == 0) {
			trays = people / feeds;
		} else if (people % feeds != 0) {
			trays = people / feeds + 1;
		}
		return (int) trays;
	}

	public static double getSUbtotal(double price, int trays) {
		double subtotal = price * trays;
		return subtotal;

	}

	public static double getTax(double subtotal, double taxRate) {

		double tax = taxRate * subtotal;
		return tax;
	}

	public static double getTip(double subtotal, double tipRate) {
		double tip = tipRate * subtotal;
		return tip;
	}

	public static double getGrandTotal(double subtotal, double tax, double tip) {
		double grantotal = subtotal + tax + tip;
		return grantotal;
	}

	public static double pricePerPerson(double grantotal, int people) {
		double pricePerPerson = grantotal / people;
		return pricePerPerson;
	}

	public static int determineLeftOvers(int feeds, int trays, int people) {
		int determineleftovers = (feeds * trays) - people;
		return determineleftovers;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String decision = "";
		double price = 0;
		int feeds = 0;
		int menuChoiced = 0;
		do {

			System.out.println("==========================================");
			AdhikariTakeOutProjects.displayMainMenu();

			int menuChoice = input.nextInt();
			if (menuChoice > 0 && menuChoice <= 3) {
				switch (menuChoice) {
				case 1:
					System.out.println("==========================================");
					menuChoiced = 1;
					AdhikariTakeOutProjects.displayItalianFoodMenu();
					break;
				case 2:
					System.out.println("==========================================");
					menuChoiced = 2;
					AdhikariTakeOutProjects.displayChineseFoodMenu();
					System.out.println("==========================================");
					break;
				case 3:
					System.out.println("==========================================");
					menuChoiced = 3;
					AdhikariTakeOutProjects.displayAmericanFoodMenu();
					System.out.println("==========================================");
					break;
				default:
					System.out.println("==========================================");
					System.out.println("wrong choice");
					System.out.println("==========================================");

				}

				System.out.println("Enter your choices");
				int foodChoice = input.nextInt();
				if (foodChoice >= 1 && foodChoice <= 3) {
					System.out.println("Enter the number of people");
					int people = input.nextInt();
					if (people >= 10 && people <= 100) {
						if (menuChoiced == 1 && foodChoice == 1) {
							System.out.println(" You have  ordered Lasanga tray");

							price = 17.99;
							feeds = 5;
						}

						else if (menuChoiced == 1 && foodChoice == 2) {
							System.out.println("You have  ordered Pizza Pack");
							price = 15.99;
							feeds = 7;
						}

						else if (menuChoiced == 1 && foodChoice == 3)

						{
							System.out.println("You have ordered Gazpacho Soup");
							price = 12.99;
							feeds = 4;
						}

						else if (menuChoiced == 2 && foodChoice == 1) {
							System.out.println("You have ordered Chicken and Broccoli Tray");
							price = 18.99;
							feeds = 7;
						}

						else if (menuChoiced == 2 && foodChoice == 2) {
							System.out.println("You have ordered  Sweet and Sour Pork Tray");
							price = 18.99;
							feeds = 7;
						}

						else if (menuChoiced == 2 && foodChoice == 3)

						{
							System.out.println("You have ordered Shrimp Freind Rice Tray");
							price = 10.99;
							feeds = 5;
						} else if (menuChoiced == 3 && foodChoice == 1) {
							System.out.println("You hava odered HamBurger and Hot Dog Tray");
							price = 21.99;
							feeds = 8;
						}

						else if (menuChoiced == 3 && foodChoice == 2) {
							System.out.println("You have ordered Grilled Chicken Sandwich and Mozzarella Sticks Tray");
							price = 22.99;
							feeds = 5;
						}

						else if (menuChoiced == 3 && foodChoice == 3)

						{
							System.out.println("You have ordered Barbeque Tray- Includes buns and peach cobbler");
							price = 26.99;
							feeds = 10;
						}

						else {
							System.out.println("Invalid Input");

						}
						System.out.println();
						System.out.println();
						AdhikariTakeOutProjects.determineTrays(people, feeds);
						System.out.println("============================================");
						int trays = AdhikariTakeOutProjects.determineTrays(people, feeds);
						System.out.println("You need " + trays + " trays");
						double subtotal = AdhikariTakeOutProjects.getSUbtotal(price, trays);
						System.out.println("total price for " + people + "(" + trays + "trays):" + subtotal);

						double tax = AdhikariTakeOutProjects.getTax(subtotal, taxRate);
						System.out.println("Tax: " + tax);
						double tip = AdhikariTakeOutProjects.getTip(subtotal, tipRate);
						System.out.println("Tip:" + tip);
						double grantotal = AdhikariTakeOutProjects.getGrandTotal(subtotal, tax, tip);
						System.out.println("Total(food,tax,tip) :" + grantotal);
						double pricePerPerson = AdhikariTakeOutProjects.pricePerPerson(grantotal, people);
						System.out.println("Price per person :" + pricePerPerson);
						int determineleftovers = AdhikariTakeOutProjects.determineLeftOvers(feeds, trays, people);
						System.out.println("Leftover Serving for the delivery person :" + determineleftovers);
						System.out.println("============================================");

					} else {
						System.out.println("Invalid People");
					}
				} else {
					System.out.println("Invalid number");
				}
			}

			else {

				System.out.println("You hava entered the wrongChoice");
			}

			System.out.println("Do you want to continue? Press y/Y to continue");
			decision = input.next();
		} while (decision.equalsIgnoreCase("y"));
		System.out.println("Thank you see you again");
		input.close();
	}

}