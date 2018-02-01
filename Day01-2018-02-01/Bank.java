import java.util.ArrayList;
import java.util.Scanner;


public class Bank {
    // Imagine this software is for the person behind the counter
    // at a bank who can access all the accounts and manage all their
    // monies (and bitcoins!)

    public static void main (String[] args) {

//        BankAccount ba1 = new BankAccount();
        BankAccount ba2 = new BankAccount(100, "Dave Ghidiu");
//        BankAccount ba3 = new BankAccount(200, "Grover Cleveland");
//
//        System.out.println(ba2.getName() + " has $" + ba2.getBalance() + " and acct# " + ba2.getAccountNumber());
//        System.out.println(ba3.getName() + " has $" + ba3.getBalance() + " and acct# " + ba3.getAccountNumber());
//
//        System.out.println(ba2);
//        System.out.println(ba3);
//
//        ba2 = ba3;
//
//        System.out.println(ba2);
//        System.out.println(ba3);
//
//        ba2.deposit(55);
//
//        System.out.println(ba2);
//        System.out.println(ba3);

//        BankAccount[] accounts = new BankAccounts[10];
//        accounts[0].getBalance();

        ArrayList<BankAccount> accounts = new ArrayList();

        accounts.add(ba2);
        accounts.add(new BankAccount(300, "Abraham Lincoln"));


        System.out.println(accounts.get(0));
        System.out.println(accounts.get(1));


        /*

            add
            remove
            get (retrieving the BankAccount at the specified index)

         */







        // ----------------------------------------------------------------------

        /*

            WHILE LOOP with a MENU

            Add account
            Check account
            Account status
            Change the name of the account holder
            Deposit
            Withdraw
            Increase EVERY account by the interest rate
            Set interest rate
            Get interest rate
            QUIT!

         */











    }


}












