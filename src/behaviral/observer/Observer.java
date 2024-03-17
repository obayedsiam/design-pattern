package behaviral.observer;

public interface Observer {
    void notify(String title);
    void subscribe(Subject subject, String name);
    void unsubscribe();

}
