package creational.factory;

/**
 * Advantages :
 * 1. Loose coupling
 * 2. Focus on object creation on interface rather than implementations. That's the headache of factory class
 *
**/

public class DeveloperClient {
    public static void main(String[] args) {
        Employee employee = EmployeeFactory.getEmployee("ANDROID");
        System.out.println(employee.salary());

        Employee employee1 = EmployeeFactory.getEmployee("WEB");
        System.out.println(employee1.salary());
    }
}
