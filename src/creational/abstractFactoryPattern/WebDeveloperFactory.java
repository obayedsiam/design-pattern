package creational.abstractFactoryPattern;

public class WebDeveloperFactory implements AbstractEmployeeFactory{

    @Override
    public Employee createEmployee() {
        return new WebDeveloper();
    }
}
