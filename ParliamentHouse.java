package parliament_java;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * class name : ParliamentHouse<br/>
 * class description : It contains different methods which allow users to add, delete or display memeber names.<br/>
 */
public class ParliamentHouse {
	private ArrayList<String> members = new ArrayList<>();
	   
    /**
     * method name : addMember<br/>
     * method description : adds a member to the list after validating user input.<br/>
     * @param scanner<br/>
     */
    public void addMember(Scanner scanner) {
        System.out.println("Enter the name of the member to add: ");
        String name = scanner.next();
        if (name.matches("[a-zA-Z]+")) {
            members.add(name);
            System.out.println("Member added successfully.\n");
        } else {
            System.out.println("Invalid name. Only alphabetic characters are allowed.\n");
        }
    }

    /**
     * method name : displayMembers<br/>
     * method description : checks if the list is empty or not. If the list contains names then it displays the names of the members.<br/>
     */
    public void displayMembers() {
    if (members.isEmpty()) {
        System.out.println("No members added yet.\n");
    } else {
        System.out.println("Members:\n");
        for (String member : members) {
            System.out.println(member);
        }
    }
}

    /**
     * method name : deleteMember<br/>
     * method description : this method deletes the member name given by the user if it exists in the list<br/>
     * @param scanner<br/>
     */
    public void deleteMember(Scanner scanner) {
    if (members.isEmpty()) {
        System.out.println("No members added yet.\n");
    } else {
        System.out.println("Enter the name of the member to delete: ");
        String name = scanner.next();
        if (members.remove(name)) {
            System.out.println("Member deleted successfully.");
        } else {
            System.out.println("Member not found.");
        }
    }
}


    /**
     * Returns the list of members<br/>
     * @return ArrayList consisting the names of the members<br/>
     */
    public ArrayList<String> getMembers() {
        return members;
    }

}
