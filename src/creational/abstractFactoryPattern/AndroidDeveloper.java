package creational.abstractFactoryPattern;

public class AndroidDeveloper implements Employee{

    @Override
    public int salary() {
        return 40000;
    }

    @Override
    public String name() {
        System.out.println("This is an Android Developer");
        return "Android";
    }


}
