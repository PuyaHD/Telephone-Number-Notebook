import java.util.ArrayList;
import java.util.Scanner;

public class TelNumNoteBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Creating an ArrayList to save new contacts' information
        ArrayList<String> newContact = new ArrayList<>();

        while (true) {
            System.out.println("Welcome to Telephone Number Notebook");
            System.out.println("================MENU================");
            System.out.println("How may I help you? \n");
            System.out.println("1.Add a new contact");
            System.out.println("2.Show all the contacts and their numbers");
            System.out.println("3.Exit \n");
            System.out.println("Wright the number of the service you want \n (e.x. wright 3 to exit the program)");

            //Now the scanner will take the order from the user.
            String order = scanner.nextLine();

            if (order.equals("1")) {
                System.out.println("Enter the name of the new contact:");
                String newContactName = scanner.nextLine();
                System.out.println("Enter the number:");
                String newContactNumber = scanner.nextLine();
                //Add the given info about the contacts to the ArrayList
                newContact.add(newContactName + " " + newContactNumber);
                System.out.println("The new contact was added successfully \n");
            }
            if (order.equals("2")) {
                //Write every contact and their number
                for (String contact : newContact){
                    System.out.println(contact);
                }
            }
            if (order.equals("3")) {
                System.out.println("Thanks for using the program. Exiting...");
                break;
            }
        }
    }
}
