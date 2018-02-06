import java.util.Scanner;
import java.util.ArrayList;

public class Bank {
    public static void main (String[] args) {

        // Welcome the user
        System.out.println("Welcome to the Bank-O-Matic 2000");

        // Create an ArrayList to hold the accounts
        ArrayList<BankAccount> accounts = new ArrayList<BankAccount>();

        // Create a Scanner object
        Scanner scanner = new Scanner(System.in);

        // Create a variable to manage the choice of the user.
        int choice;

        // WHILE LOOP to iterate until the user chooses "9. Quit" (which will invoke 'return')
        while (true) {

            // Display the menu and load 'choice' with input from user
            displayMenu();
            System.out.print("Your choice: ");
            choice = scanner.nextInt(); // Don't worry about erroneous data
            System.out.println();

            // Handle the 'choice' with a switch statement
            // Call methods (passing in the ArrayList 'accounts')
            switch (choice) {
                case 1: addAccount(accounts);
                    break;
                case 2: checkStatus(accounts);
                    break;
                case 3: changeAccountHolderName(accounts);
                    break;
                case 4: deposit(accounts);
                    break;
                case 5: withdraw(accounts);
                    break;
                case 6: getInterestRate();
                    break;
                case 7: setInterestRate();
                    break;
                case 8: applyInterest(accounts);
                    break;
                case 9: System.out.println("Thank you for using Bank-O-Matic.");
                    return;
                default:
                    System.out.println("Not a valid number.");
                    break;
            }
        }
    }

    // Displays the menu
    public static void displayMenu() {
        System.out.println("\n\nPlease select from the following menu:");
        System.out.println("\t1. Add an account");
        System.out.println("\t2. Check status of an account");
        System.out.println("\t3. Change the name of an account holder");
        System.out.println("\t4. Deposit money in an account");
        System.out.println("\t5. Withdraw money from an account");
        System.out.println("\t6. Get the interest rate");
        System.out.println("\t7. Set the interest rate");
        System.out.println("\t8. Apply interest to every account");
        System.out.println("\t9. Quit");
    }

    public static void addAccount(ArrayList<BankAccount> accounts) {

       System.out.println("Program stub: addAccount()");
      
    }

    // Implicitly calls the toString() method on a specified account
    public static void checkStatus(ArrayList<BankAccount> accounts) {
        
        System.out.println("Program stub: checkStatus()");
        
    }

    public static void changeAccountHolderName(ArrayList<BankAccount> accounts) {
        
        System.out.println("Program stub: changeAccountHolderName()");
      
    }

    // Adds a specified value to the instance variable 'balance' of a specified account
    public static void deposit(ArrayList<BankAccount> accounts) {
        
        System.out.println("Program stub: deposit()");
       
    }

    public static void withdraw(ArrayList<BankAccount> accounts) {
        
        System.out.println("Program stub: withdraw()");

    }
    
    // Display the interest rate
    // This is the static class variable that is applied to all BankAccounts
    public static void getInterestRate() {
    
        System.out.println("Program stub: getInterestRate()");

    }

    // Set the interest rate
    // This is a static reference to 'interestRate' that applies to all BankAccounts
    public static void setInterestRate() {
    
        System.out.println("Program stub: setInterestRate()");
        
    }

    // Walk through every BankAccount in 'accounts' and adjust the balance appropriately
    public static void applyInterest(ArrayList<BankAccount> accounts) {
    
        System.out.println("Program stub: applyInterest()");

    }
}
