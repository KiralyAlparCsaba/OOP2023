package lab11_2;

import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Company company = new Company("Sapientia Comapny");
        company.hireAll("employee.csv");
        company.printAll(System.out);
        System.out.println();
        //company.fire(4);
        company.printAll(System.out);
        company.printManagers(System.out);
        System.out.println();

        company.sortByComparator(
                (e1, e2) -> {
                    if (e1.getFirstName().equals(e2.getFirstName())) {
                        return e1.getLastName().compareTo(e2.getLastName());
                    }
                    return e1.getFirstName().compareTo(e2.getFirstName());
                }
        );
        company.printAll(System.out);
        System.out.println();

        company.sortByComparator(
                new Comparator<Employee>() {
                    @Override
                    public int compare(Employee o1, Employee o2) {
                        if (o2.getSalary() - o1.getSalary() > 0) {
                            return 1;
                        } else if (o2.getSalary() - o1.getSalary() < 0) {
                            return -1;
                        }
                        return 0;
                    }
                }
        );
        company.printAll(System.out);
        System.out.println();

        company.sortByComparator((e1,e2)->{
            if(e1 instanceof Manager && e2 instanceof Manager){
                if(e1.getFirstName().equals(e2.getFirstName())){
                    return e1.getLastName().compareTo(e2.getLastName());
                }
                return e1.getFirstName().compareTo(e2.getFirstName());
            }else if(e1 instanceof Manager && e2 instanceof Employee){
                return -1;
            }else if(e1 instanceof Employee && e2 instanceof Manager){
                return 1;
            }else{
                if(e1.getFirstName().equals(e2.getFirstName())){
                    return e1.getLastName().compareTo(e2.getLastName());
                }
                return e1.getFirstName().compareTo(e2.getFirstName());
            }
        });
        company.printAll(System.out);

    }
}

