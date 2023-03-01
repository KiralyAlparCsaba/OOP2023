package labor3_2;

import labor3_1.BankAccount;

import java.util.Arrays;

public class Customer {
    private String firstName;
    private String lastName;
    public static final int MAX_ACCOUNTS = 10;
    private int numAccounts;
    private BankAccount accounts[] = new BankAccount[MAX_ACCOUNTS];


    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void addAccounts(BankAccount accounts) {
        if (numAccounts <= MAX_ACCOUNTS) {
            this.accounts[numAccounts] = accounts;
            numAccounts++;
        }
    }

    public BankAccount getAccounts(String accountNumber) {
        for (int i = 0; i <= MAX_ACCOUNTS; ++i) {
            if (accountNumber.equals(this.accounts[i].getAccountNumber())) {
                return this.accounts[i];
            }
        }
        return null;
    }

    public int getNumAccounts() {
        return numAccounts;
    }

    public void closeAccount(int accountNumber) {
        this.accounts[accountNumber].setBalance(0);
        if (accountNumber < numAccounts) {

            for (int i = accountNumber; i < numAccounts; i++) {
                accounts[i].setBalance(accounts[i + 1].getBalance());
            }
            numAccounts--;
        }
        if (accountNumber == numAccounts)
            numAccounts--;
    }

    @Override
    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append(firstName + ' ' + lastName + " accounts:\n");
        for (int i = 0; i < numAccounts; ++i) {
            result.append("\t" + accounts[i] + "\n");
        }
        return result.toString();
    }
}
