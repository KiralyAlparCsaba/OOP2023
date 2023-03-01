package labor3_1;

public class Main {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("OTP0001");
        Customer cus1 = new Customer("John","BLACK");
        cus1.setAccount(acc1);
        System.out.println(cus1.getFirstName()+" "+cus1.getLastName());
        cus1.getAccount().deposit(10000);
        System.out.println(cus1.toString());
        Customer cus2 = new Customer("Mary","WHITE");
        BankAccount acc2 = new BankAccount("OTP0002");
        cus2.setAccount(acc2);
        cus2.getAccount().deposit(5000);
        System.out.println(cus2.toString());
        cus2.closeAccount();
        System.out.println(cus2.toString());
        cus2.setAccount(cus1.getAccount());
        System.out.println(cus1.toString());
        System.out.println(cus2.toString());





    }
}
