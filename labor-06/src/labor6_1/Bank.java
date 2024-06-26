package labor6_1;

import java.io.PrintStream;
import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Customer> customers = new ArrayList<>();

    public Bank(String name) {
        this.name = name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }
    public void AddCustomer(Customer customer){
        customers.add(customer);
    }
    public int getNumCustomers(){
        return customers.size();
    }
    private void printCustomers( PrintStream ps ) {
        ps.println("ID, Firstname, Last name, Number of bank accounts");
        for( Customer customer: customers ) {
            ps.println( customer.getId()+", " + customer.getFirstName() + ", "+
                    customer.getLastName()+", "+customer.getNumAccounts());
        }
        ps.close();
    }

    public void printCustomersToStdout() {
        printCustomers( System.out );
    }
    public void printCustomersToFile( String filename ) {
        try {
            printCustomers( new PrintStream(filename ));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
