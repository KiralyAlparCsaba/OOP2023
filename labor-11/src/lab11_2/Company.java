package lab11_2;

import lab11_1.MyDate;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.*;

public class Company {
    private String name;
    private ArrayList<Employee> employees;
    public Company(String name){
        this.name = name;
        employees = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void hire(Employee e){
        if(!employees.contains(e)){
            employees.add(e);
        }
    }

    public void fire(int id){
        for (Employee e :employees){
            if(e.getID() == id){
                employees.remove(e);
                break;
            }
        }
    }

    public void printDepartments(){
        for(Employee employee : employees){
            if(employee.getClass() == Manager.class){
                System.out.println(((Manager) employee).getDepartment());
            }
        }
    }
    public void hireAll(String fileName){
        try(Scanner scanner = new Scanner(new File(fileName))){
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                if(line.isEmpty()){
                    continue;
                }
                String[] items = line.split(",");
                Employee employee = null;
                if(items.length == 7){
                    employee = new Manager(
                            items[0].trim(),
                            items[1].trim(),
                            Double.parseDouble(items[2].trim()),
                            new MyDate(Integer.parseInt(items[3].trim()),
                                    Integer.parseInt(items[4].trim()),
                                    Integer.parseInt(items[5].trim())
                            ),
                            items[6].trim()
                    );
                }else{
                    employee = new Employee(
                            items[0].trim(),
                            items[1].trim(),
                            Double.parseDouble(items[2].trim()),
                            new MyDate(Integer.parseInt(items[3].trim()),
                                    Integer.parseInt(items[4].trim()),
                                    Integer.parseInt(items[5].trim())
                            ));
                }
                this.hire(employee);
            }



        }catch (FileNotFoundException e){
            System.out.println("File not found: " + fileName);
        }
    }

    public void printAll(PrintStream ps){
        employees.forEach(ps::println);
    }
    public void printManagers(PrintStream ps){

        employees.forEach((e)->{
                    if(e.getClass() == Manager.class)
                        ps.println(e);
                }
        );

    }

    public void sortByComparator(Comparator<Employee> comp){
        Collections.sort(employees,comp);
    }

}

