package parliament_java;

import java.util.Scanner;

/**
 * class name : LokSabha<br/>
 * class description : this class represents Lok sabha the lower house of Indian Parliament<br/>
 * It extends the {@link ParliamentHouse} to inherit its functionality for managing members.<br/>
 * @see ParliamentHouse<br/>
 */
public class LokSabha extends ParliamentHouse {
	/**
	 * Displays details about Lok Sabha and allows user to add, display and delete members in it.<br/>
	 * @param scanner<br/>
	 */
    public static void displayDetails(Scanner scanner) {
        System.out.println("\nAs per the provision of Article 79 of Indian Constitution, the House of the People, the Lok Sabha is the lower House of the parliament. Lok Sabha is composed of representatives of the people chosen by direct election on the basis of the adult suffrage\n");

        int Lchoice;
        LokSabha ls = new LokSabha();
        do {
            System.out.println("Lok Sabha");
            System.out.println("1. Speaker");
            System.out.println("2. Add Member");
            System.out.println("3. Display Members");
            System.out.println("4. Delete Member");
            System.out.println("5. Back to main menu");
            System.out.println("Enter your choice: ");

            Lchoice = scanner.nextInt();

            switch (Lchoice) {
                case 1:
                    System.out.println("\nThe current speaker of Lok Sabha is 'Shri Om Birla'\n");
                    break;
                case 2:
                    ls.addMember(scanner);
                    break;
                case 3:
                    ls.displayMembers();
                    break;
                case 4:
                    ls.deleteMember(scanner);
                    break;
                case 5:
                    System.out.println("\nReturning to main menu\n");
                    break;
                default:
                    System.out.println("\nInvalid choice, please try again");
            }
        } while (Lchoice != 5);
    }

}
