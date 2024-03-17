package creational.prototype;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class NetworkConnection implements Cloneable {

    private String ip;
    private String importantData;
    private List<String> domain = new ArrayList<>();

    public List<String> getDomain() {
        return domain;
    }

    public void setDomain(List<String> domain) {
        this.domain = domain;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getImportantData() {
        return importantData;
    }

    public void setImportantData(String importantData) {
        this.importantData = importantData;
    }

    @Override
    public String toString() {
        return "NetworkConnection{" +
                "ip='" + ip + '\'' +
                ", importantData='" + importantData + '\'' +
                '}';
    }

    public void loadImportantData() throws InterruptedException {
        this.importantData = "very very important";
        domain.add("www.google.com");
        domain.add("www.facebook.com");
        domain.add("www.youtube.com");

        Thread.sleep(5000);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        NetworkConnection connection = new NetworkConnection();
        connection.setIp(this.ip);
        connection.setImportantData(this.importantData);

        for (String d : domain) {
            connection.getDomain().add(d);
        }
        return connection;
    }

    public String getTime() {
        return "Network Connection creation time :" + LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));
    }


}
