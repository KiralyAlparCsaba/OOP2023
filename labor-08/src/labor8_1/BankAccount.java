package labor8_1;

public class BankAccount {
    protected final String accountNumber;
    protected double balance;
    public static final String PREFIX = "OTP";
    public static final int ACCOUNT_NUMBER_LENGTH = 10;
    private static int numAccounts = 0;


    private static String createAccountNumber(){
        int length =ACCOUNT_NUMBER_LENGTH - PREFIX.length();
        return String.format("%s%0"+length+"d",PREFIX,numAccounts);
    }
    protected BankAccount() {
        ++numAccounts;
        this.accountNumber = createAccountNumber();
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
    public void deposit(double amount){
        this.balance = amount;
    }
    public boolean withdraw(double amount){
        if(this.balance-amount<0){
            return false;
        }
            this.balance-=amount;
        return true;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                '}' + '\n';
    }
}
