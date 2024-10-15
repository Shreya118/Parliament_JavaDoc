package parliament_java;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * <h1>Parliament</h1>
 * @author Shreya Pagui <br/>
 * roll no. : 44 <br/>
 * title : implementation of parliament <br/>
 * description : this program displays details of Indian Parliament and allows user to add, display and delete members in Lok sabha and Rajya sabha. <br/>
 */

public class Parliament {
	/**
	 * 
     * class name : Parliament<br/>
     * class description : This is the main class. It gives user a menu to select different sections of parliament.<br/>
	 * @param args (not used)<br/>
	 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Indian Parliament");
            System.out.println("1. President of India");
            System.out.println("2. Rajya Sabha");
            System.out.println("3. Lok Sabha");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    President.displayDetails(scanner);
                    break;
                case 2:
                    RajyaSabha.displayDetails(scanner);
                    break;
                case 3:
                    LokSabha.displayDetails(scanner);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice, please try again");
            }
        } while (choice != 4);

        scanner.close();

	}

}
