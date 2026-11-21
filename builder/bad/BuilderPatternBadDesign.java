package builder.bad;

class Employee {

    private Long id;
    private String name;
    private String email;
    private String department;
    private String phone;
    private String address;
    Employee(Long id, String name){}

    Employee(Long id, String name, String email){}

    Employee(Long id, String name, String email,
             String department, String phone, String address){}
}

public class BuilderPatternBadDesign {
    public static void main(String[] args){
        Employee employee = new Employee(
                101L,
                "Rahul",
                "rahul@gmail.com",
                "IT",
                "9876543210",
                "Kolkata"
        );
    }
}
