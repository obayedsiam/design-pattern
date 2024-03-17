package creational.prototype;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Tester {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("First Network Connection creating :" + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));

        NetworkConnection networkConnection = Helper.createConnection();
        System.out.println("Printing 1st NetworkConnection Object");
        Helper.printDetails(networkConnection);

        NetworkConnection networkConnection2 = null;
        try {
            networkConnection2 = (NetworkConnection) networkConnection.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        System.out.println("2nd Network connection created");
        Helper.printDetails(networkConnection2);

        System.out.println("Deleting from 1st object domain");
        networkConnection.getDomain().remove(0);
        Helper.printDetails(networkConnection);

        System.out.println("Printing 2nd NetworkConnection Object");
        Helper.printDetails(networkConnection2);


    }

}
