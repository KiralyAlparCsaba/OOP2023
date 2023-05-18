package lab11_2;

import lab11_1.MyDate;

public class Employee {
    private final int ID;
    private String firstName;
    private String lastName;
    private double salary;
    private static int counter;
    private MyDate birthDate;

    public Employee(String firstName, String lastName, double salary, MyDate birthDate){
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.birthDate = birthDate;
        this.ID = ++counter;
    }

    public int getID() {
        return ID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Employee.counter = counter;
    }

    public MyDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(MyDate birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "ID=" + ID +
                "| firstName='" + firstName + '\'' +
                "| lastName='" + lastName + '\'' +
                "| salary=" + salary +
                "| birthDate=" + birthDate;
    }
}
