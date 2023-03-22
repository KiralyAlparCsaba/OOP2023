package labor6_1;

import java.sql.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<BankAccount> accounts = new ArrayList<>();
        for (int i=0;i<150;i++){
            accounts.add(new BankAccount());

        }

        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(new Customer("John","Black"));

        customers.add(new Customer("Mary","White"));
        customers.add(new Customer("Thomas","Ball"));
        //System.out.println(customers.toString());
        for (int i=0;i<customers.size();i++){
            customers.get(i).addAccounts(accounts.get(i));

        }
        System.out.println(customers);
        Bank bank = new Bank("OTP");
        bank.AddCustomer(customers.get(0));
        bank.AddCustomer(customers.get(1));
        customers.get(0).addAccounts(accounts.get(4));
        customers.get(1).addAccounts((accounts.get(5)));
        customers.get(1).getAccount("OTP0000001").deposit(5000);
        customers.get(2).getAccount("OTP0000002").deposit(3000);
        bank.printCustomersToStdout();



    }
}
