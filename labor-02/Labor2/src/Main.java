public class Main {
    public static void main(String[] args) {

    //1
        BankAccount account1 = new BankAccount("OTP00001");
        account1.deposit(1000);
        System.out.println(account1.getAccountNumber()+" : "+account1.getBalance()+"\n");
        account1.withdraw(500);
        System.out.println(account1.getAccountNumber()+" : "+account1.getBalance()+"\n");
        account1.withdraw(1000);
        System.out.println(account1.getAccountNumber()+" : "+account1.getBalance()+"\n");
        BankAccount account2 = new BankAccount("OTP00002");
        System.out.println(account2.getAccountNumber()+" : "+account2.getBalance()+"\n");
        account2.deposit(2000);
        System.out.println(account2.getAccountNumber()+" : "+account2.getBalance()+"\n");




    }
}