package behaviral.observer;

public interface Subject {
    void newVideoUploaded(String title);
    void subscribe(Subscriber sb);
    void unsubscribe(String name);
}
