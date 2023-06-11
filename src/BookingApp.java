// Importing all java packages
import java.util.*;
import java.io.IOException;

/*
*	@author Iestynlee
*	@version 0.1
*/

public class BookingApp {
	public static void main(String[] args) throws IOException, InterruptedException{

		// Array of of all initial data
		Assistant[] assistants = {new Assistant ("Ronan Mueller", "RM@uok.ac.uk"), new Assistant("Marvin Harvey", "MH@uok.ac.uk"), new Assistant("Amarah Hassan", "AH@uok.ac.uk")};
		Room[] rooms = {new Room ("IC265", 20), new Room ("IC345", 10), new Room ("IC344", 5)};
		//BookableRoom bookablerooms = {}; 

		// Initializing the main menu
		mainMenu();
    }

    /**
	* For clearing the screen
    */
    public static void clearScreen() throws IOException, InterruptedException{
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }

    /*
    private static void menuSelection() throws IOException, InterruptedException{
    	int swOption;
    	Scanner input = new Scanner(System.in);
		System.out.print("Enter an option: ");
		swOption = input.nextInt();
		return swOption;
    }*/

    /**
	*	This is the main menu and generates it in a class while stopping issues with exceptions form the clears
	*
    */

	//This is the Main Menu Displaying Selections
	private static void mainMenu() throws IOException, InterruptedException{
		clearScreen();
		int swOption;
		System.out.println("University of Knowledge - COVID test");
		System.out.println("");
		System.out.println("Manage Bookings");
		System.out.println("");
		System.out.println("Please, enter the number to select your option:");
		System.out.println("");
		System.out.println("To manage Bookable Rooms:");
		System.out.println("	1. List");
		System.out.println("	2. Add");
		System.out.println("	3. Remove");
		System.out.println("To manage Assistants on Shift:");
		System.out.println("	4. List");
		System.out.println("	5. Add");
		System.out.println("	6. Remove");
		System.out.println("To manage Bookings:");
		System.out.println("	7. List");
		System.out.println("	8. Add");
		System.out.println("	9. Remove");
		System.out.println("	10. Conclude");
		System.out.println("After selecting one the options above, you will be presented other screens.");
		System.out.println("If you press 0, you will be able to return to this main menu.");
		System.out.println("Press -1 (or ctrl+c) to quit this application.");
		System.out.println("");

		/** 
		*	Looping the options
		*/
		while(true){
			// This checks for the input of option
			Scanner input = new Scanner(System.in);
			System.out.print("Enter an option: ");
			swOption = input.nextInt();

			// Initially tries the options
			try{
				// These are the switch cases for each of the options
				switch(swOption) {
					case -1:
						System.exit(1); //Exits the system
					break;
					case 0:
						System.out.println("Return to Main Menu"); //Says its on the main menu
					break;
					case 1:
						menu1(); //Allows to move to menu1
					break;
					case 2:
						menu2(); //Allows to move to menu2, etc same with next options
					break;
					case 3:
						menu3();
					break;
					case 4:
						menu4();
					break;
					case 5:
						menu5();
					break;
					case 6:
						menu6();
					break;
					case 7:
						menu7();
					break;
					case 8:
						menu8();
					break;
					case 9:
						menu9();
					break;
					case 10:
						menu10();
					break;
					default:
						System.out.println("Invalid selection");
					break;
				}
			} 
			// This is the exception to check if there is no such element aka Ctrl+C
			catch(NoSuchElementException e){
				System.exit(1);
			}
		}
	}

	/*
	*	This is for the menus and adds all the menu to the main menu
	*/
	//List of bookable rooms
	private static void menu1() throws IOException, InterruptedException{
		clearScreen();
		int swOption;

		System.out.println("University of Knowledge - COVID test");
		System.out.println("");
		//Print list of bookable rooms
		System.out.println("0. Back to main menu.");
		System.out.println("-1. Quit application.");
		System.out.println("");

		Scanner input = new Scanner(System.in);
		System.out.print("Enter an option: ");
		swOption = input.nextInt();

		switch(swOption){
			case -1:
				System.exit(1);
			break;
			case 0:
				mainMenu();
			break;
			default:
				System.out.println("Invalid selection");
			break;
		}
	}

	//Add Bookable Rooms
	private static void menu2() throws IOException, InterruptedException{
		clearScreen();
		int swOption;

		System.out.println("University of Knowledge - COVID test");
		System.out.println("");
		System.out.println("Adding bookable room");
		System.out.println("");
		//<list rooms>
		System.out.println("Please, enter one of the following: ");
		System.out.println("");
		//The sequential ID listed to a room, a date (dd/mm/yyyy), and a time (HH:MM), separated by a white space.
		System.out.println("0. Back to main menu.");
		System.out.println("-1. Quit application.");
		System.out.println("");

		Scanner input = new Scanner(System.in);
		System.out.print("Enter an option: ");
		swOption = input.nextInt();

		switch(swOption){
			case -1:
				System.exit(1);
			break;
			case 0:
				mainMenu();
			break;

			default:
				System.out.println("Invalid selection");
			break;
		}
	}

	// Remove bookable rooms
	private static void menu3() throws IOException, InterruptedException{
		clearScreen();
		int swOption;

		System.out.println("University of Knowledge - COVID test");
		System.out.println("");
		//<list bookable rooms status:EMPTY>
		System.out.println("Removing bookable room");
		System.out.println("");
		System.out.println("Please, enter one of the following: ");
		System.out.println("");
		//The sequential ID to select the bookable room to be removed.
		System.out.println("0. Back to main menu.");
		System.out.println("-1. Quit app");

		Scanner input = new Scanner(System.in);
		System.out.print("Enter an option: ");
		swOption = input.nextInt();

		switch(swOption){
			case -1:
				System.exit(1);
			break;
			case 0:
				mainMenu();
			break;

			default:
				System.out.println("Invalid selection");
			break;
		}
	}

	// List assistants on shift
	private static void menu4() throws IOException, InterruptedException{
		clearScreen();
		int swOption;

		System.out.println("University of Knowledge - COVID test");
		System.out.println("");
		//<list assistant on shifts>
		System.out.println("0. Back to main menu.");
		System.out.println("-1. Quit application.");
		System.out.println("");

		Scanner input = new Scanner(System.in);
		System.out.print("Enter an option: ");
		swOption = input.nextInt();

		switch(swOption){
			case -1:
				System.exit(1);
			break;
			case 0:
				mainMenu();
			break;

			default:
				System.out.println("Invalid selection");
			break;
		}
	}

	// Add assistants on shift
	private static void menu5() throws IOException, InterruptedException{
		clearScreen();
		int swOption;

		System.out.println("University of Knowledge - COVID test");
		System.out.println("");
		System.out.println("Adding assistant on shift");
		System.out.println("");
		//<list assistants>
		System.out.println("Please, enter one of the following:");
		System.out.println("");
		//The sequential ID of an assistant and date (dd/mm/yyyy), separated by a white space.
		System.out.println("0. Back to main menu.");
		System.out.println("-1. Quit application.");
		System.out.println("");

		Scanner input = new Scanner(System.in);
		System.out.print("Enter an option: ");
		swOption = input.nextInt();

		switch(swOption){
			case -1:
				System.exit(1);
			break;
			case 0:
				mainMenu();
			break;

			default:
				System.out.println("Invalid selection");
			break;
		}
	}

	// Remove assistant on shift
	private static void menu6() throws IOException, InterruptedException{
		clearScreen();
		int swOption;

		System.out.println("University of Knowledge - COVID test");
		System.out.println("");
		//<list assistant on shifts status:FREE>
		System.out.println("Removing assistant on shift");
		System.out.println("");
		System.out.println("Please, enter one of the following:");
		System.out.println("");
		//The sequential ID to select the assistant on shift to be removed.
		System.out.println("0. Back to main menu.");
		System.out.println("-1. Quit application.");
		System.out.println("");

		Scanner input = new Scanner(System.in);
		System.out.print("Enter an option: ");
		swOption = input.nextInt();

		switch(swOption){
			case -1:
				System.exit(1);
			break;
			case 0:
				mainMenu();
			break;

			default:
				System.out.println("Invalid selection");
			break;
		}
	}

	// List bookings
	private static void menu7() throws IOException, InterruptedException{
		clearScreen();
		int swOption;

		System.out.println("University of Knowledge - COVID test");
		System.out.println("");
		System.out.println("Select which booking to list:");
		System.out.println("1. All");
		System.out.println("2. Only bookings status:SCHEDULED");
		System.out.println("3. Only bookings status:COMPLETED");
		System.out.println("0. Back to main menu.");
		System.out.println("-1. Quit application.");
		System.out.println("");

		Scanner input = new Scanner(System.in);
		System.out.print("Enter an option: ");
		swOption = input.nextInt();

		switch(swOption){
			case -1:
				System.exit(1);
			break;
			case 0:
				mainMenu();
			break;
			/*case 1:
			//
			break;
			case 2:
			//
			break;
			case 3:
			//
			break;*/

			default:
				System.out.println("Invalid selection");
			break;
		}
	}

	// Add bookings to list
	private static void menu8() throws IOException, InterruptedException{
		clearScreen();
		int swOption;

		System.out.println("University of Knowledge - COVID test");
		System.out.println("");
		System.out.println("Adding booking (appointment for a COVID test) to the system");
		System.out.println("");
		System.out.println("List of available time-slots:");
		/*11. dd/mm/yyyy HH:MM
		12. dd/mm/yyyy HH:MM
		13. dd/mm/yyyy HH:MM
		...*/
		System.out.println("");
		System.out.println("Please, enter one of the following:");
		System.out.println("");
		//The sequential ID of an available time-slot and the student email, separated by a white space.
		System.out.println("0. Back to main menu.");
		System.out.println("-1. Quit application.");
		System.out.println("");

		Scanner input = new Scanner(System.in);
		System.out.print("Enter an option: ");
		swOption = input.nextInt();

		switch(swOption){
			case -1:
				System.exit(1);
			break;
			case 0:
				mainMenu();
			break;

			default:
				System.out.println("Invalid selection");
			break;
		}
	}

	// Remove bookings
	private static void menu9() throws IOException, InterruptedException{
		clearScreen();
		int swOption;

		System.out.println("University of Knowledge - COVID test");
		System.out.println("");
		//<list booking status:SCHEDULED>
		System.out.println("Removing booking from the system");
		System.out.println("");
		System.out.println("Please, enter one of the following:");
		System.out.println("");
		//The sequential ID to select the booking to be removed from the listed bookings above.
		System.out.println("0. Back to main menu.");
		System.out.println("-1. Quit application.");
		System.out.println("");

		Scanner input = new Scanner(System.in);
		System.out.print("Enter an option: ");
		swOption = input.nextInt();

		switch(swOption){
			case -1:
				System.exit(1);
			break;
			case 0:
				mainMenu();
			break;

			default:
				System.out.println("Invalid selection");
			break;
		}
	}

	// Conclude Booking
	private static void menu10() throws IOException, InterruptedException{
		clearScreen();
		int swOption;

		System.out.println("University of Knowledge - COVID test");
		System.out.println("");
		//<list booking status:SCHEDULED>
		System.out.println("Conclude booking");
		System.out.println("");
		System.out.println("Please, enter one of the following:");
		System.out.println("");
		//The sequential ID to select the booking to be completed.
		System.out.println("0. Back to main menu.");
		System.out.println("-1. Quit application.");
		System.out.println("");

		Scanner input = new Scanner(System.in);
		System.out.print("Enter an option: ");
		swOption = input.nextInt();

		switch(swOption){
			case -1:
				System.exit(1);
			break;
			case 0:
				mainMenu();
			break;

			default:
				System.out.println("Invalid selection");
			break;
		}
	}
}