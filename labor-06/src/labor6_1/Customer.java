package labor6_1;
import java.util.ArrayList;


public class Customer {
    private String firstName;
    private String lastName;
    private ArrayList<BankAccount> accounts = new ArrayList<>();

    private int  id = 1;


    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        id++;
    }

    public void addAccounts(BankAccount account) {
        this.accounts.add(account);
    }
    public BankAccount getAccount(String accountNumber){
        for (BankAccount a : accounts){
            if(a.getAccountNumber().equals(accountNumber)){
                return a;
            }
        }
        return null;
    }
    public void closeAccount(String accountNumber){
        this.accounts = null;
    }

    public int getNumAccounts(){
        return this.accounts.size();
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

    public int getId() {
        return id;
    }

    private ArrayList<String> getAccountNumber(){
        ArrayList<String> result = new ArrayList<>();
        for(BankAccount account : this.accounts){
            result.add(account.getAccountNumber());
        }
        return result;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", accounts=" + accounts +
                ", id=" + id +
                '}';
    }
}
