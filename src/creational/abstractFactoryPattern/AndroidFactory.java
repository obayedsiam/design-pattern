package creational.abstractFactoryPattern;

public class AndroidFactory implements AbstractEmployeeFactory{

    @Override
    public Employee createEmployee() {
        return new AndroidDeveloper();
    }
}
