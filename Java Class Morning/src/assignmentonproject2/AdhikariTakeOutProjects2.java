package assignmentonproject2;

import java.util.Scanner;

public class AdhikariTakeOutProjects2 {
	final static double tipRate = 0.15;
	final static double taxRate = 0.07;

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
