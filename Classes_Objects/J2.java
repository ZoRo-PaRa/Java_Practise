class Employee {
    private long id;
    private String name;
    private String email;
    private double salary;

    public void setEmployee(long id, String name, String email, double salary) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.salary = salary;
    }

    public void getEmployee() {
        System.out.println("Id: " + id);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Salary: " + salary);
    }

    public void annualSalary() {
        double sal = salary * 12;
        System.out.println("Salary: " + sal);
    }
    
}


class J2 {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.setEmployee(1, "Subhash", "suboo@gmail.com", 20000.50);
        e1.getEmployee();
        e1.annualSalary();

    }
}