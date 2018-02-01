public class BankAccount {

    // A model of all the things a BankAccount should have
    //   - account number
    //   - balance
    //   - name
    //   - interest rate
    //
    // and all the things a BankAccount can do
    //   - deposit
    //   - withdraw
    //   - accrue interest
    //   - show balance
    // Don't forget toString()!!!!!


    private static double interestRate;
    private static int masterAccountNumber = 1000;

    private double balance;
    private String name;
    private int accountNumber;


    // Constructors
    public BankAccount() {
        balance = 0;
        name = "";
        accountNumber = masterAccountNumber;
        masterAccountNumber++;
    }

    public BankAccount(double bal, String name) {

        balance = bal;
        this.name = name;
        accountNumber = masterAccountNumber;
        masterAccountNumber++;

    }


    public String toString() {
        return getName() + " has $" + getBalance() + " and acct# " + getAccountNumber();
    }

    public void showBalance() {
        System.out.println("Your balance is: " + balance);
    }

    public void deposit(double amt) {
        // add the 'amt' to 'balance'
        // show the balance

        if (amt < 0) {
            System.out.println("Amount must be greater than zero.");
            return;
        }

        balance += amt;
        System.out.println("Your NEW balance is " + balance);
    }

    public void withdraw(double amt) {

        if (amt < 0) {
            System.out.println("Amount must be greater than zero.");
            return;
        }

        if (amt > balance) {
            System.out.println("Insufficient funds");
        }

        balance -= amt;
        System.out.println("Your NEW balance is " + balance);
    }

    public void accrueInterest() {
        balance *= (1 + interestRate);
    }





















    // ACCESSORS and MUTATORS

    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    // End ACCESSORS and MUTATORS









}












