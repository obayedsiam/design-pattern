package creational.abstractFactoryPattern;

public class EmployeeFactory {

    public static Employee createEmployee(AbstractEmployeeFactory factory){
        Employee employee = factory.createEmployee();
        return employee;
    }
}
