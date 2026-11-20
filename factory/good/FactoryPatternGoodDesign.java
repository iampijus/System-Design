package factory.good;

interface Employee{
    void calculateSalary();
}

class ParmanentEmployee implements Employee{

    @Override
    public void calculateSalary() {
        System.out.println("Permanent employee salary");
    }
}

class ContractualEmployee implements Employee{

    @Override
    public void calculateSalary() {
        System.out.println("Contractual employee salary");
    }
}

class Intern implements Employee{

    @Override
    public void calculateSalary() {
        System.out.println("Intern employee salary");
    }
}

class EmployeeFactory{
    public EmployeeFactory(){

    }

    public static Employee getEmployee(String type){
        if(type.equalsIgnoreCase("PERMANENT")){
            return new ParmanentEmployee();
        }else if(type.equalsIgnoreCase("CONTRACT")){
            return new ContractualEmployee();
        }else if(type.equalsIgnoreCase("INTERN")){
            return new Intern();
        }
        throw new RuntimeException("No employee found");
    }
}

class EmployeeService{
    public void processEmployee(String type){
        Employee employee=EmployeeFactory.getEmployee(type);
        employee.calculateSalary();
    }

}


public class FactoryPatternGoodDesign {
    public static void main(String[] args){
        EmployeeService employeeService=new EmployeeService();
        employeeService.processEmployee("INTERN");
    }
}
