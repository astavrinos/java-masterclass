import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone {

    public static Scanner sc = new Scanner(System.in);
    public static ArrayList<Contacts> contacts = new ArrayList<>();

    public static void main(String[] args) {
        initMenu();
    }

    private static void initMenu() {
        while (true) {

            System.out.println("Select menu: \nOption 1: Quit\nOption 2: Add new contact\nOption 3: Modify contact\nOption 4: Remove contact\nOption 5: Search/Find contact\nOption 6: Show contact list");

            int userInput = sc.nextInt();
            sc.nextLine();

            if (userInput == 1) {
                System.out.println("Bye");
                break;
            } else if (userInput == 2) {
                createNewContact();
            } else if (userInput == 3) {
                modifyContact();
            } else if (userInput == 4) {
                removeContact();
            } else if (userInput == 5) {
                searchContact();
            } else if (userInput == 6) {
                printContactList();
            } else {
                System.out.println("Please enter a valid option");
            }
        }
    }

    public static void createNewContact() {
        System.out.println("Name: ");
        String contactName = sc.nextLine();
        System.out.println("Phone number: ");
        int phoneNumber = sc.nextInt();

        if (checkIfContactDoesNotExist(contactName)) {
            Contacts contact = new Contacts(contactName, phoneNumber);
            contacts.add(contact);
        } else {
            System.out.println("Contact already exist!");
        }

    }

    public static void modifyContact() {
        System.out.println("Modify contact with name: ");
        String existingContactName = sc.nextLine();

        int position = findContactToModify(existingContactName);

        if (position != -1) {
            System.out.println("Edit contact with name " + existingContactName + " to: ");
            String toChangeContactName = sc.nextLine();
            System.out.println("And phone number to: ");
            int toChangePhoneNumber = sc.nextInt();
            if (verifyContactDoesNotExist(toChangeContactName)) {
                contacts.get(position).setName(toChangeContactName);
                contacts.get(position).setPhoneNumber(toChangePhoneNumber);
            } else {
                System.out.println("Contact exist with the same name!");
            }
        }

    }

    private static boolean verifyContactDoesNotExist(String toChangeContactName) {

        for (Contacts contact : contacts) {
            if (contact.getName().equals(toChangeContactName)) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkIfContactDoesNotExist(String contactName) {
        if (contacts.isEmpty()) {
            return true;
        }

        for (Contacts contact : contacts) {
            if (!contact.getName().equals(contactName)) {
                return true;
            }
        }
        return false;
    }

    public static int findContactToModify(String contactName) {
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getName().equals(contactName)) {
                return i;
            }
        }
        return -1;
    }

    public static void removeContact() {

        System.out.println("Contact name to be removed: ");
        String contactToBeRemoved = sc.nextLine();

        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getName().equals(contactToBeRemoved)) {
                contacts.remove(i);
                System.out.println("Removed contact with name " + contactToBeRemoved);
            }
        }
    }

    public static boolean searchContact() {
        System.out.println("Search for a contact with a name: ");
        String searchContact = sc.nextLine();

        for (Contacts contact : contacts) {
            if (contact.getName().equals(searchContact)) {
                System.out.println("Contact name: " + contact.getName() + " | Phone Number: " + contact.getPhoneNumber());
                return true;
            }
        }
        System.out.println("Contact not found!");
        return false;
    }

    public static void printContactList() {
        for (int i = 0; i < contacts.size(); i++) {
            System.out.println((i + 1) + ". Contact name: " + contacts.get(i).getName() + " - Phone number: " + contacts.get(i).getPhoneNumber());
        }
    }

}
