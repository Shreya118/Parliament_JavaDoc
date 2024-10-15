package parliament_java;

import java.util.Scanner;

/**
 * class name : President<br/>
 * class description : THis class provides the user with the information about President of India.<br/>
 */


public class President {
	/**
	 * Displays information about President of India and allows user to get more information about president or to return to the main menu.<br/>
	 * @param scanner a Scanner object is used to read user input.<br/>
	 */
    public static void displayDetails(Scanner scanner) {
        System.out.println("\nThe President of India is an integral part of the Parliament though he/she is not a member of either House of Parliament. Under the Constitution, the executive power of the Union is vested in the President to be exercised by him/her either directly or through officers subordinates to him/her.\n");

        int Pchoice;
        do {
            System.out.println("1. President");
            System.out.println("2. Back to main menu");
            System.out.println("Enter your choice: ");

            Pchoice = scanner.nextInt();

            switch (Pchoice) {
                case 1:
                    System.out.println("\nThe current President of India is 'Smt. Droupadi Murmu'\n");
                    break;
                case 2:
                    System.out.println("\nReturning to main menu\n");
                    break;
                default:
                    System.out.println("\nInvalid choice, please try again");
            }
        } while (Pchoice != 2);
    }

}
