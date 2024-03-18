package structural.adapter;

public class Iphone13 {

    AppleCharger appleCharger;

    public Iphone13(AppleCharger iphoneCharger){
        this.appleCharger = iphoneCharger;
    }

    public void charge(){
        appleCharger.chargeIphone();
    }

}
