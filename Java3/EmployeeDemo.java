class Employee {
    String name, address, jobTitle;
    double salary;

    Employee(String name, String address, String jobTitle, double salary) {
        this.name = name;
        this.address = address;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }
    void calculateBonus() {
        System.out.println("Bonus: " + (salary * 0.10));
    }
    void performanceReport() {
        System.out.println("Performance is satisfactory.");
    }
}
class Manager extends Employee {
    Manager(String name, String address, double salary) {
        super(name, address, "Manager", salary);
    }
    void manageProjects() {
        System.out.println("Managing projects.");
    }
}
class Developer extends Employee {
    Developer(String name, String address, double salary) {
        super(name, address, "Developer", salary);
    }
    void writeCode() {
        System.out.println("Writing code.");
    }
}
class Programmer extends Employee {
    Programmer(String name, String address, double salary) {
        super(name, address, "Programmer", salary);
    }
    void debugCode() {
        System.out.println("Debugging code.");
    }
}
public class EmployeeDemo {
    public static void main(String[] args) {
        Manager m = new Manager("Amit", "Delhi", 80000);
        m.calculateBonus();
        m.manageProjects();
    }
}