package creational.prototype;

public class Helper {

    private static NetworkConnection networkConnection = new NetworkConnection();

    public static void printDetails(NetworkConnection networkConnection){
        System.out.println(networkConnection.hashCode());
        System.out.println(networkConnection);
        System.out.println(networkConnection.getDomain());
        System.out.println();
    }

    public static NetworkConnection createConnection() throws InterruptedException {
        networkConnection.setIp("192.168.0.1");
        networkConnection.setImportantData("Very Important Data");
        networkConnection.loadImportantData();
        System.out.println(networkConnection.getTime());
        return networkConnection;
    }

}
