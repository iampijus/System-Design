package factory.bad;

 class PermanentEmployee{
    public void calculateSalary() {
        System.out.println("Permanent employee salary");
    }
}

 class ContractEmployee {
    public void calculateSalary() {
        System.out.println("Contract employee salary");
    }
}

 class Intern {
    public void calculateSalary() {
        System.out.println("Intern salary");
    }
}

class EmployeeService {

    public void processEmployee(String type) {

        if (type.equals("PERMANENT")) {
            PermanentEmployee employee = new PermanentEmployee();
            employee.calculateSalary();

        } else if (type.equals("CONTRACT")) {
            ContractEmployee employee = new ContractEmployee();
            employee.calculateSalary();

        } else if (type.equals("INTERN")) {
            Intern employee = new Intern();
            employee.calculateSalary();
        }
    }
}

public class FactoryPatternBadDesign {
     public static void main(String[] args){

     }
}
