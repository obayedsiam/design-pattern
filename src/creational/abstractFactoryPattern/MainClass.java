package creational.abstractFactoryPattern;

public class MainClass {
    public static void main(String[] args) {
        Employee employee = EmployeeFactory.createEmployee(new AndroidFactory());
        System.out.println(employee.name());
        System.out.println(employee.salary());

        Employee employee1 = EmployeeFactory.createEmployee(new WebDeveloperFactory());
        System.out.println(employee1.name());
        System.out.println(employee1.salary());
    }
}
