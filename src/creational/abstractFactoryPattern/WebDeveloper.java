package creational.abstractFactoryPattern;

public class WebDeveloper implements Employee{

    @Override
    public int salary() {
        return 50000;
    }

    @Override
    public String name() {
        System.out.println("This is an Web Developer");
        return "Web Developer";
    }
}
