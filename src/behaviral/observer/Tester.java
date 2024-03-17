package behaviral.observer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tester {
    public static void main(String[] args) throws IOException {
        Youtube channel = new Youtube();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {

            System.out.println("Press 1 to upload new video");
            System.out.println("Press 2 to add new subscriber");
            System.out.println("Press 3 to unsubscribe");
            System.out.println("Press 4 to exit");

            int input = Integer.parseInt(br.readLine());

            if (input == 1) {
                System.out.println("Add new video title");
                String title = br.readLine();
                channel.newVideoUploaded(title);
            } else if (input == 2) {
                System.out.println("Add new subscriber name");
                String name = br.readLine();
                Subscriber ob = new Subscriber(name);
                channel.getSubscriberList().add(ob);

            } else if (input == 3) {
                System.out.println("Enter name to unsubscribe");
                String name = br.readLine();
                channel.unsubscribe(name);

            } else {
                System.out.println("Thanks for using this system");
                System.exit(0);
            }
        }
    }

}
