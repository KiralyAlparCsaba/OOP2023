package lab4_2;

public class BankAccount {
    private String accountNumber;
    private double balance;


    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
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
    public void withdraw(double amount){
        if(this.balance-amount<0){
            System.out.println("Insufficient bank balance");
        }
        else
            this.balance-=amount;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
