public class BankAccount {

    // There are two static variables that apply to all instances of BankAccount
    private static double interestRate = 0.0375;
    private static int masterAccountNumber = 1000;

    // Instance variables
    private double balance;
    private String name;
    private int accountNumber;


    // CONSTRUCTORS ---------------------------------------------------

    // Default constructor
    public BankAccount() {
        
        balance = 0;
        name = "";
        accountNumber = masterAccountNumber;
        masterAccountNumber++;
    
    }

    // Constructor that takes the starting balance and a name
    public BankAccount(double bal, String name) {

        balance = bal;
        this.name = name;
        accountNumber = masterAccountNumber;
        masterAccountNumber++;

    }

    // END CONSTRUCTORS -----------------------------------------------




    // ACCESSORS & MUTATORS -------------------------------------------

    // balance
    public double getBalance() {
        return balance;
    }

    public void setBalance(double amt) {
        balance = amt;
    }

    // name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // accountNumber - only ACCESSOR
    public int getAccountNumber() {
        return accountNumber;
    }

    // interestRate
    public static double getInterestRate() {
        return interestRate;
    }

    public static void setInterestRate(double rate) {
        interestRate = rate;
    }

    // END ACCESSORS & MUTATORS ---------------------------------------




    // Overriding the 'toString()' method inherited from Object -------

    public String toString() {
        return getName() + " has $" + getBalance() + " and account number #" + getAccountNumber();
    }

    // END Overriding the 'toString()' method inherited from Object ---




    // CLASS METHODS --------------------------------------------------

    // Add 'amt' to 'balance'
    // Check to see that 'amt' is positive
    public void deposit(double amt) {

        if (amt < 0) {
            System.out.println("Amount must be greater than zero.");
            return;
        }

        balance += amt;
        System.out.println("The balance for account number " + accountNumber + " is $" + balance);
    }

    // Subtract 'amt' from 'balance'
    // Check to see if 'amt' is greater than 'balance'
    // Check to see that 'amt' is a positive number
    public void withdraw(double amt) {

        if (amt < 0) {
            System.out.println("Amount must be greater than zero.");
            return;
        }

        if (amt > balance) {
            System.out.println("Insufficient funds");
            return;
        }

        balance -= amt;
        System.out.println("The balance for account number " + accountNumber + " is " + balance);
    }

    // Modify the balance by the 'interestRate'
    public void accrueInterest() {
        balance *= (1 + interestRate);
    }

    // END CLASS METHODS ----------------------------------------------

}
