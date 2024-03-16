package creational.prototype;

import java.security.Timestamp;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Tester {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("First Network Connection creating :"+ LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));

        NetworkConnection networkConnection = new NetworkConnection();
        networkConnection.setIp("192.168.0.1");
        networkConnection.setImportantData("Very Important Data");
        networkConnection.loadImportantData();
        System.out.println("First Network Connection created :"+ LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));

        System.out.println(networkConnection.hashCode());

        NetworkConnection  networkConnection1 = null;
        try {
            networkConnection1 = (NetworkConnection) networkConnection.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        System.out.println("Second Network Connection created :"+ LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss")));

        System.out.println(networkConnection1.hashCode());

    }
}
