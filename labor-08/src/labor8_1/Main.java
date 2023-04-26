package labor8_1;

public class Main {
    public static void main(String[] args) {
        BankAccount bac1 = new BankAccount();
        BankAccount bac2 = new CheckingAccount(2000);
        bac1.deposit(10);
        bac2.deposit(10);
        bac1.withdraw(20);
        bac2.withdraw(20);
        System.out.println(bac1.toString());
        System.out.println(bac2.toString());

        Customer cus1 = new Customer("Jani", "Nagy");
        Customer cus2 = new Customer("Juli", "Kicsi");
        cus1.addAccounts(bac2);
        BankAccount bac3 = new CheckingAccount(50);
        cus2.addAccounts(bac3);
        BankAccount bac4 = new SavingsAccount(2);
        cus1.addAccounts(bac4);
        BankAccount bac5 = new SavingsAccount(3);
        cus1.addAccounts(bac5);
        Bank bank1 = new Bank("OTP");
        bank1.AddCustomer(cus1);
        bank1.AddCustomer(cus2);

        bac2.deposit(100);
        bac3.deposit(200);
        bac4.deposit(300);
        bac5.deposit(400);
        System.out.println(bank1.getCustomers());

        ((SavingsAccount) bac5).addInterest();
        System.out.println("\n"+bank1.getCustomers());

        bac2.withdraw(2000);
        bac3.withdraw(2000);
        bac4.withdraw(2000);
        bac5.withdraw(2005);
        System.out.println("\n"+bank1.getCustomers());
    }

}

