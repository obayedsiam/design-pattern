package creational.factory;

public class EmployeeFactory {

    public static Employee getEmployee(String empType) {
        Employee employee = null;
        if (empType.trim().equalsIgnoreCase("ANDROID")) {
            employee = new AndroidDeveloper();
        } else if (empType.trim().equalsIgnoreCase("WEB")) {
            employee = new WebDeveloper();
        }
        return employee;
    }
}
