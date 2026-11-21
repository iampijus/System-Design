package builder.good;

class Employee{
    private Long id;
    private String name;
    private String email;
    private Employee(Builder builder){
        this.id=builder.id;
        this.name=builder.name;
        this.email=builder.email;
    }

    public static Builder builder(){
        return new Builder();
    }

    public static class Builder{
        private Long id;
        private String name;
        private String email;

        public Builder id(Long id){
            this.id=id;
            return this;
        }
        public Builder name(String name){
            this.name=name;
            return this;
        }
        public Builder email(String email){
            this.email=email;
            return this;
        }
        public Employee build(){
            return new Employee(this);
        }
    }
}

public class BuilderPatternGoodDesign {
    public static void main(String[] args){
        Employee employee=Employee.builder()
                .id(101L)
                .name("Pijus")
                .email("pijus@gmail.com")
                .build();
    }
}
