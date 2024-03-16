package creational.builder;

/**
 * 1. Chained returning Structure
 * 2. Solves the problem of Factory Pattern,
 * i.e. if the constructor need a number of parameters then Builder Pattern is the solution
 **/
public class MainClass {
    public static void main(String[] args) {
        User user = User.build()
                .setUserId("123")
                .setUserName("Rahim")
                .setEmailId("abc@gmail.com")
                .build();
        System.out.println(user);
    }
}
