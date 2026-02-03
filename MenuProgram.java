import java.util.Scanner;
import java.time.Year;

public class MenuProgram {

    // Method to say hello
    static void sayHello() {
        System.out.println("Hello! Welcome to the program ");
    }

    // Method to show current year
    static void showYear() {
        int currentYear = Year.now().getValue();
        System.out.println("Current Year: " + currentYear);
    }

    // Method to show menu and handle choices
    static void showMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Say Hello");
            System.out.println("2. Show Current Year");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    sayHello();
                    break;
                case 2:
                    showYear();
                    break;
                case 3:
                    System.out.println("Exiting program... Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 3);
    }

    // Main method
    public static void main(String[] args) {
        showMenu();
    }
}
