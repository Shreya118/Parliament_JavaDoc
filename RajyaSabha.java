package parliament_java;

import java.util.Scanner;


/**
 * class name : RajyaSabha<br/>
 * class description : it represents Rajya Sabha, the upper house of Indian Parliament.<br/>
 * It extends the {@link ParliamentHouse} to inherit its functionality for managing members.<br/>
 * @see ParliamentHouse<br/>
 */

public class RajyaSabha extends ParliamentHouse {
	/**
	 * Displays details about Rajya Sabha and allows user to add, display and delete members in it.<br/>
	 * @param scanner<br/>
	 */
    public static void displayDetails(Scanner scanner) {
        System.out.println("\nCouncil of States i.e Rajya Sabha is the Upper House of the Indian Parliament. Rajya Sabha consists of the representatives of the States and the Union Territories and persons nominated by the President of India.\n");

        int Rchoice;
        RajyaSabha rs = new RajyaSabha();
        do {
            System.out.println("Rajya Sabha");
            System.out.println("1. Chairman");
            System.out.println("2. Deputy Chairman");
            System.out.println("3. Add Member");
            System.out.println("4. Display Members");
            System.out.println("5. Delete Member");
            System.out.println("6. Back to main menu");
            System.out.println("Enter your choice: ");

            Rchoice = scanner.nextInt();

            switch (Rchoice) {
                case 1:
                    System.out.println("\nThe current chairman of Rajya Sabha 'Shri Jagdeep Dhankhar' \n");
                    break;
                case 2:
                    System.out.println("\nThe current deputy chairman of Rajya Sabha 'Shri Harivansh' \n");
                    break;
                case 3:
                    rs.addMember(scanner);
                    break;
                case 4:
                    rs.displayMembers();
                    break;
                case 5:
                    rs.deleteMember(scanner);
                    break;
                case 6:
                    System.out.println("\nReturning to main menu\n");
                    break;
                default:
                    System.out.println("\nInvalid choice, please try again");
            }
        } while (Rchoice != 6);
    }
}