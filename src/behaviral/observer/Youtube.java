package behaviral.observer;

import java.util.ArrayList;
import java.util.List;

public class Youtube implements Subject{

    public List<Subscriber> getSubscriberList() {
        return subscriberList;
    }

    public void setSubscriberList(List<Subscriber> subscriberList) {
        this.subscriberList = subscriberList;
    }

    private List<Subscriber> subscriberList = new ArrayList<>();

    public Youtube(){

        Subscriber rahim = new Subscriber("Rahim");
        Subscriber karim = new Subscriber("Karim");

        getSubscriberList().add(rahim);
        getSubscriberList().add(karim);
    }

    @Override
    public void newVideoUploaded(String title) {
        for(Observer ob: subscriberList){
            ob.notify(title);
        }
    }

    @Override
    public void subscribe(Subscriber ob) {
        subscriberList.add(ob);
    }

    @Override
    public void unsubscribe(String name) {
        for(Subscriber subscriber : this.getSubscriberList()){
            if(subscriber.getName().equalsIgnoreCase(name)){
                this.getSubscriberList().remove(subscriber);
                break;
            }
        }
    }
}
