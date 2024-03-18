package structural.adapter;

public class Android {

    AndroidCharger androidCharger;

    public Android(AndroidCharger charger) {
        this.androidCharger = charger;
    }

    public void charge() {
        androidCharger.chargeAndroid();
    }

}
