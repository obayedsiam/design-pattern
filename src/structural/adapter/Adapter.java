package structural.adapter;

public class Adapter implements AppleCharger{

    private AndroidCharger androidCharger;

    public Adapter(AndroidCharger androidCharger) {
        this.androidCharger = androidCharger;
    }

    @Override
    public void chargeIphone(){
        System.out.println("You are using adapter to charge iphone");
        androidCharger.chargeAndroid();
        System.out.println("Your Iphone is Charging ");
    }
}
