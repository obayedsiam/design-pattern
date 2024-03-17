package behaviral.observer;

public class Subscriber implements Observer {
    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void notify(String title) {
        System.out.println("Hello " + this.name + ", " + "New Video Uploaded : " + title);
    }

    @Override
    public void subscribe(Subject subject, String name) {
        subject.subscribe(this);
    }

    @Override
    public void unsubscribe() {

    }
}
