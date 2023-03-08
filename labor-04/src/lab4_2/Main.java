package lab4_2;

import lab4_1.Person;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        public static ArrayList<Customer> readFromCSVFile (String fileName){
            ArrayList<Customer> customers = new ArrayList<>();
            try (Scanner scanner = new Scanner(new File(fileName))) {
                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine();
                    if (line.isEmpty()) {
                        continue;
                    }
                    String[] items = line.split(",");
                    String type = items[0].trim();
                    if (type.equals("Customer")) {
                        String firstName = items[1].trim();
                        String lastName = items[2].trim();
                        customers.add(new Customer(firstName, lastName));
                    } else if (type.equals("Account")) {
                        Customer customer = customers.get(customers.size() - 1);
                        String accountNr = items[1].trim();
                        double balance = Double.parseDouble((items[2].trim()));
                        BankAccount account = new BankAccount(accountNr);
                        account.deposit(balance);
                        customer.addAccounts(account);
                    }

                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            //return customers;
        }
    }
}


